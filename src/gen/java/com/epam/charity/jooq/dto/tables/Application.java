/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.ApplicationRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Application extends TableImpl<ApplicationRecord> {

    private static final long serialVersionUID = -411417877;

    /**
     * The reference instance of <code>dev.application</code>
     */
    public static final Application APPLICATION = new Application();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationRecord> getRecordType() {
        return ApplicationRecord.class;
    }

    /**
     * The column <code>dev.application.id</code>.
     */
    public final TableField<ApplicationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dev.application_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev.application.full_name</code>.
     */
    public final TableField<ApplicationRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.application.gender</code>.
     */
    public final TableField<ApplicationRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>dev.application.legal_tutor</code>.
     */
    public final TableField<ApplicationRecord, String> LEGAL_TUTOR = createField("legal_tutor", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>dev.application.email</code>.
     */
    public final TableField<ApplicationRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.application.age</code>.
     */
    public final TableField<ApplicationRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.application.birth_date</code>.
     */
    public final TableField<ApplicationRecord, Date> BIRTH_DATE = createField("birth_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>dev.application.music_school</code>.
     */
    public final TableField<ApplicationRecord, String> MUSIC_SCHOOL = createField("music_school", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>dev.application.professor_list</code>.
     */
    public final TableField<ApplicationRecord, String> PROFESSOR_LIST = createField("professor_list", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>dev.application.professor_email</code>.
     */
    public final TableField<ApplicationRecord, String> PROFESSOR_EMAIL = createField("professor_email", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>dev.application.website</code>.
     */
    public final TableField<ApplicationRecord, String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>dev.application.ensembles</code>.
     */
    public final TableField<ApplicationRecord, String> ENSEMBLES = createField("ensembles", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>dev.application.category_id</code>.
     */
    public final TableField<ApplicationRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.application.address_id</code>.
     */
    public final TableField<ApplicationRecord, Integer> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.application.music_discipline_id</code>.
     */
    public final TableField<ApplicationRecord, Integer> MUSIC_DISCIPLINE_ID = createField("music_discipline_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dev.application</code> table reference
     */
    public Application() {
        this("application", null);
    }

    /**
     * Create an aliased <code>dev.application</code> table reference
     */
    public Application(String alias) {
        this(alias, APPLICATION);
    }

    private Application(String alias, Table<ApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Application(String alias, Table<ApplicationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ApplicationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationRecord> getPrimaryKey() {
        return Keys.PRIMARY15;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationRecord>>asList(Keys.PRIMARY15);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationRecord, ?>>asList(Keys.APPLICATION__APPLICATION_CATEGORY, Keys.APPLICATION__APPLICATION_ADDRESS, Keys.APPLICATION__APPLICATION_DISCIPLINE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Application as(String alias) {
        return new Application(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Application rename(String name) {
        return new Application(name, null);
    }
}
