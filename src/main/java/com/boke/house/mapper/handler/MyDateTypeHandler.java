package com.boke.house.mapper.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Date;

@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes(Date.class)
public class MyDateTypeHandler implements TypeHandler {
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException {
        Date date = null;
        try {
            long result = rs.getLong(columnName);
            date = new Date(result);
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
        long result;
        try {
            result = rs.getLong(columnIndex);
            Date date = new Date(result);
        } catch (Exception e) {
            return null;
        }
        return new Date(result);
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        Date date;
        try {
            long result = cs.getLong(columnIndex);
            date = new Date(result);
        } catch (Exception e) {
            return null;
        }
        return date;
    }
}
