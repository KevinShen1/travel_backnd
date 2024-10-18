package com.travel.service.Impl.sys;

import com.travel.mapper.*;
import com.travel.model.*;
import com.travel.service.sys.UserMgmtService;
import com.travel.vo.ProgTreeVo;
import com.travel.vo.SaveUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {

    @Autowired
    VwUserAuthRolesMapper vwUserAuthRolesMapper;
    @Autowired
    TbSysRoleMapper tbSysRoleMapper;
    @Autowired
    TbSysProgMapper tbSysProgMapper;
    @Autowired
    TbSysRoleProgSetMapper tbSysRoleProgSetMapper;
    @Autowired
    TbSysUserMapper tbSysUserMapper;
    @Autowired
    TbSysUserRoleSetMapper tbSysUserRoleSetMapper;

    @Override
    public List<VwUserAuthRoles> queryUserList() {
        VwUserAuthRolesExample example = new VwUserAuthRolesExample();
        VwUserAuthRolesExample.Criteria criteria = example.createCriteria();
        return vwUserAuthRolesMapper.selectByExample(example);
    }

    @Override
    public List<TbSysRole> queryRoleList() {
        TbSysRoleExample example = new TbSysRoleExample();
        TbSysRoleExample.Criteria criteria = example.createCriteria();
        return tbSysRoleMapper.selectByExample(example);
    }

    @Override
    public List<ProgTreeVo> queryAllProgList(String parentProgId) {
        List<ProgTreeVo> progTreeVoList = new ArrayList<>();

        TbSysProgExample example = new TbSysProgExample();
        TbSysProgExample.Criteria criteria = example.createCriteria();
        criteria.andParentProgIdEqualTo(parentProgId);
        List<TbSysProg> tbSysProgList = tbSysProgMapper.selectByExample(example);

        for (TbSysProg tbSysProg : tbSysProgList) {
            ProgTreeVo progTreeVo = new ProgTreeVo();
            progTreeVo.setTitle(tbSysProg.getProgId());
            progTreeVo.setKey(tbSysProg.getProgId());
            progTreeVo.setChildren(queryAllProgList(tbSysProg.getProgId()));
            progTreeVo.setExpanded(true);
            progTreeVo.setDisableCheckbox(true);
            progTreeVoList.add(progTreeVo);
        }
        return progTreeVoList;
    }

    @Override
    public List<String> getRoleProg(@RequestBody String roleId) {
        List<String> roleProgList = new ArrayList<>();

        TbSysRoleProgSetExample example = new TbSysRoleProgSetExample();
        TbSysRoleProgSetExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        List<TbSysRoleProgSet> tbSysRoleProgSetList = tbSysRoleProgSetMapper.selectByExample(example);

        for (TbSysRoleProgSet tbSysRoleProgSet : tbSysRoleProgSetList) {
            roleProgList.add(tbSysRoleProgSet.getProgId());
        }
        return roleProgList;
    }

    @Override
    public void saveUser(SaveUserVo saveUserVo) {
        if(tbSysUserMapper.selectByPrimaryKey(saveUserVo.getUserInfo().getUserId()) == null) {
            saveUserVo.getUserInfo().setCreateUserId(saveUserVo.getUserId());
            saveUserVo.getUserInfo().setCreateDatetime(new Date());
            tbSysUserMapper.insertSelective(saveUserVo.getUserInfo());

            TbSysUserRoleSet tbSysUserRoleSet = new TbSysUserRoleSet();
            tbSysUserRoleSet.setUserId(saveUserVo.getUserInfo().getUserId());
            tbSysUserRoleSet.setRoleId(saveUserVo.getRoleId());
            tbSysUserRoleSet.setCreateUserId(saveUserVo.getUserId());
            tbSysUserRoleSet.setCreateDatetime(new Date());
            tbSysUserRoleSetMapper.insertSelective(tbSysUserRoleSet);

        }else  {
            saveUserVo.getUserInfo().setLastUpdateUserId(saveUserVo.getUserId());
            saveUserVo.getUserInfo().setLastUpdateDatetime(new Date());
            tbSysUserMapper.updateByPrimaryKeySelective(saveUserVo.getUserInfo());

            TbSysUserRoleSet tbSysUserRoleSet = new TbSysUserRoleSet();
            tbSysUserRoleSet.setUserId(saveUserVo.getUserInfo().getUserId());
            tbSysUserRoleSet.setRoleId(saveUserVo.getRoleId());
            tbSysUserRoleSet.setCreateUserId(saveUserVo.getUserId());
            tbSysUserRoleSet.setCreateDatetime(new Date());
            tbSysUserRoleSetMapper.updateByPrimaryKeySelective(tbSysUserRoleSet);
        }
    }

    @Override
    public SaveUserVo getUserInfoById(String userId) {
        SaveUserVo userInfo = new SaveUserVo();
        userInfo.setUserId(userId);
        userInfo.setUserInfo(tbSysUserMapper.selectByPrimaryKey(userId));

        TbSysUserRoleSetExample example = new TbSysUserRoleSetExample();
        TbSysUserRoleSetExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);

        userInfo.setRoleId(tbSysUserRoleSetMapper.selectByExample(example).get(0).getRoleId());
        return userInfo;
    }
}
