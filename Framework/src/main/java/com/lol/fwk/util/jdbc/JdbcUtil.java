package com.lol.fwk.util.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc操作类（带连接池）
 */
public final class JdbcUtil {

    private static JdbcUtil instance = new JdbcUtil();
    /**
     * 数据源
     */
    private DataSource dataSource;

    public JdbcUtil() {
        DbConfig config = new DbConfig();
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(config.getUrl());
        bds.setDriverClassName(config.getDriver());
        bds.setUsername(config.getUserName());
        bds.setPassword(config.getPassword());
        bds.setInitialSize(config.getInitialSize());
        bds.setMaxTotal(config.getMaxTotal());
        bds.setMaxConnLifetimeMillis(config.getMaxConnLifetimeMillis());
        bds.setMinIdle(config.getMinIdle());
        bds.setMaxIdle(config.getMaxIdle());
        bds.setMaxWaitMillis(config.getMaxWaitMillis());
        bds.setTestOnBorrow(true);
        bds.setValidationQuery("select 1");
        dataSource = bds;
    }

    public static JdbcUtil getInstance() {
        return instance;
    }

    /**
     * 建立数据库连接
     *
     * @return
     * @throws java.sql.SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        if (dataSource != null) {
            conn = dataSource.getConnection();
        }

        return conn;
    }

    /**
     * 释放资源
     *
     * @param conn
     * @param statement
     * @param rs
     */
    public void free(Connection conn, Statement statement, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }

        if (statement != null) {
            statement.close();
        }

        if (conn != null) {
            conn.close();
        }
    }
}
