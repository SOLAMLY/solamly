package com.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.solamly.solamly.module.download.FileBean;
import com.example.solamly.solamly.module.greendao.BehaviorBean;
import com.example.solamly.solamly.module.greendao.IconBean;
import com.example.solamly.solamly.module.greendao.PersonalBean;
import com.example.solamly.solamly.module.greendao.UserBean;

import com.greendao.gen.FileBeanDao;
import com.greendao.gen.BehaviorBeanDao;
import com.greendao.gen.IconBeanDao;
import com.greendao.gen.PersonalBeanDao;
import com.greendao.gen.UserBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig fileBeanDaoConfig;
    private final DaoConfig behaviorBeanDaoConfig;
    private final DaoConfig iconBeanDaoConfig;
    private final DaoConfig personalBeanDaoConfig;
    private final DaoConfig userBeanDaoConfig;

    private final FileBeanDao fileBeanDao;
    private final BehaviorBeanDao behaviorBeanDao;
    private final IconBeanDao iconBeanDao;
    private final PersonalBeanDao personalBeanDao;
    private final UserBeanDao userBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        fileBeanDaoConfig = daoConfigMap.get(FileBeanDao.class).clone();
        fileBeanDaoConfig.initIdentityScope(type);

        behaviorBeanDaoConfig = daoConfigMap.get(BehaviorBeanDao.class).clone();
        behaviorBeanDaoConfig.initIdentityScope(type);

        iconBeanDaoConfig = daoConfigMap.get(IconBeanDao.class).clone();
        iconBeanDaoConfig.initIdentityScope(type);

        personalBeanDaoConfig = daoConfigMap.get(PersonalBeanDao.class).clone();
        personalBeanDaoConfig.initIdentityScope(type);

        userBeanDaoConfig = daoConfigMap.get(UserBeanDao.class).clone();
        userBeanDaoConfig.initIdentityScope(type);

        fileBeanDao = new FileBeanDao(fileBeanDaoConfig, this);
        behaviorBeanDao = new BehaviorBeanDao(behaviorBeanDaoConfig, this);
        iconBeanDao = new IconBeanDao(iconBeanDaoConfig, this);
        personalBeanDao = new PersonalBeanDao(personalBeanDaoConfig, this);
        userBeanDao = new UserBeanDao(userBeanDaoConfig, this);

        registerDao(FileBean.class, fileBeanDao);
        registerDao(BehaviorBean.class, behaviorBeanDao);
        registerDao(IconBean.class, iconBeanDao);
        registerDao(PersonalBean.class, personalBeanDao);
        registerDao(UserBean.class, userBeanDao);
    }
    
    public void clear() {
        fileBeanDaoConfig.clearIdentityScope();
        behaviorBeanDaoConfig.clearIdentityScope();
        iconBeanDaoConfig.clearIdentityScope();
        personalBeanDaoConfig.clearIdentityScope();
        userBeanDaoConfig.clearIdentityScope();
    }

    public FileBeanDao getFileBeanDao() {
        return fileBeanDao;
    }

    public BehaviorBeanDao getBehaviorBeanDao() {
        return behaviorBeanDao;
    }

    public IconBeanDao getIconBeanDao() {
        return iconBeanDao;
    }

    public PersonalBeanDao getPersonalBeanDao() {
        return personalBeanDao;
    }

    public UserBeanDao getUserBeanDao() {
        return userBeanDao;
    }

}
