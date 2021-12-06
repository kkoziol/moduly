module com.sages.ocap.daoLoger {
    requires com.sages.ocap.dao;
    provides com.sages.ocap.dao.logs.DaoLogs with com.sages.ocap.dao.logger.DaoLoger;
}