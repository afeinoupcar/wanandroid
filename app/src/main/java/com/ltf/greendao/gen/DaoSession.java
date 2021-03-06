package com.ltf.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.afei.bat.afeiplayandroid.bean.People;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig peopleDaoConfig;

    private final PeopleDao peopleDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        peopleDaoConfig = daoConfigMap.get(PeopleDao.class).clone();
        peopleDaoConfig.initIdentityScope(type);

        peopleDao = new PeopleDao(peopleDaoConfig, this);

        registerDao(People.class, peopleDao);
    }
    
    public void clear() {
        peopleDaoConfig.clearIdentityScope();
    }

    public PeopleDao getPeopleDao() {
        return peopleDao;
    }

}
