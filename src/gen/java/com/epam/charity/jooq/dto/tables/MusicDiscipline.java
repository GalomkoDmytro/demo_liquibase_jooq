/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.MusicDisciplineRecord;

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
public class MusicDiscipline extends TableImpl<MusicDisciplineRecord> {

    private static final long serialVersionUID = 346435381;

    /**
     * The reference instance of <code>dev.music_discipline</code>
     */
    public static final MusicDiscipline MUSIC_DISCIPLINE = new MusicDiscipline();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MusicDisciplineRecord> getRecordType() {
        return MusicDisciplineRecord.class;
    }

    /**
     * The column <code>dev.music_discipline.id</code>.
     */
    public final TableField<MusicDisciplineRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dev.music_discipline_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dev.music_discipline.discipline</code>.
     */
    public final TableField<MusicDisciplineRecord, String> DISCIPLINE = createField("discipline", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>dev.music_discipline</code> table reference
     */
    public MusicDiscipline() {
        this("music_discipline", null);
    }

    /**
     * Create an aliased <code>dev.music_discipline</code> table reference
     */
    public MusicDiscipline(String alias) {
        this(alias, MUSIC_DISCIPLINE);
    }

    private MusicDiscipline(String alias, Table<MusicDisciplineRecord> aliased) {
        this(alias, aliased, null);
    }

    private MusicDiscipline(String alias, Table<MusicDisciplineRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MusicDisciplineRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MUSIC_DISCIPLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MusicDisciplineRecord> getPrimaryKey() {
        return Keys.PRIMARY14;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MusicDisciplineRecord>> getKeys() {
        return Arrays.<UniqueKey<MusicDisciplineRecord>>asList(Keys.PRIMARY14);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicDiscipline as(String alias) {
        return new MusicDiscipline(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MusicDiscipline rename(String name) {
        return new MusicDiscipline(name, null);
    }
}