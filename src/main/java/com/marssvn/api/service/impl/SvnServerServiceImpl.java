package com.marssvn.api.service.impl;

import com.marssvn.api.model.entity.SvnServer;
import com.marssvn.api.service.ISvnServerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangkx
 */
@Service
public class SvnServerServiceImpl extends BaseService implements ISvnServerService {

    /**
     * Get repository list
     *
     * @return List
     */
    @Override
    public List<SvnServer> getSvnServerList() {

        // Query svn server list
        return commonDAO.queryForList("SvnServer.selectMany");
    }
}
