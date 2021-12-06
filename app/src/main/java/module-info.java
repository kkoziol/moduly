module com.sages.ocap.app {
    requires com.sages.ocap.dao;
    uses com.sages.ocap.dao.Dao;

    requires com.sages.ocap.entity;

    exports com.sages.ocap.app;
}