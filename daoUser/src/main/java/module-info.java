module com.sages.ocap.dao.daoUser {
    requires com.sages.ocap.entity;
    requires com.sages.ocap.dao;

    provides com.sages.ocap.dao.Dao with com.sages.ocap.daoUser.UserDao;

    exports com.sages.ocap.daoUser;
}