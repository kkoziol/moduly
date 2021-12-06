module com.sages.ocap.daoUser {
    requires com.sages.ocap.entity;

    requires com.sages.ocap.dao;
    uses com.sages.ocap.dao.logs.DaoLogs;

    requires static com.sages.ocap.daoLoger;


    provides com.sages.ocap.dao.Dao with com.sages.ocap.daoUser.UserDao;

    exports com.sages.ocap.daoUser;
}