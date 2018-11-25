/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.JudgeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Judge extends TableImpl<JudgeRecord> {

    private static final long serialVersionUID = 1316555451;

    /**
     * The reference instance of <code>dev.JudgeDao</code>
     */
    public static final Judge JUDGE = new Judge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JudgeRecord> getRecordType() {
        return JudgeRecord.class;
    }

    /**
     * The column <code>dev.JudgeDao.id</code>.
     */
    public final TableField<JudgeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dev.judge_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev.JudgeDao.name</code>.
     */
    public final TableField<JudgeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.JudgeDao.password</code>.
     */
    public final TableField<JudgeRecord, Integer> PASSWORD = createField("password", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.JudgeDao.full_name</code>.
     */
    public final TableField<JudgeRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.JudgeDao.email</code>.
     */
    public final TableField<JudgeRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.JudgeDao.role</code>.
     */
    public final TableField<JudgeRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>dev.JudgeDao.title</code>.
     */
    public final TableField<JudgeRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>dev.JudgeDao.description</code>.
     */
    public final TableField<JudgeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>dev.JudgeDao</code> table reference
     */
    public Judge() {
        this("JudgeDao", null);
    }

    /**
     * Create an aliased <code>dev.JudgeDao</code> table reference
     */
    public Judge(String alias) {
        this(alias, JUDGE);
    }

    private Judge(String alias, Table<JudgeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Judge(String alias, Table<JudgeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dev.DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JudgeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JUDGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JudgeRecord> getPrimaryKey() {
        return Keys.PRIMARY16;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JudgeRecord>> getKeys() {
        return Arrays.<UniqueKey<JudgeRecord>>asList(Keys.PRIMARY16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Judge as(String alias) {
        return new Judge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Judge rename(String name) {
        return new Judge(name, null);
    }
}