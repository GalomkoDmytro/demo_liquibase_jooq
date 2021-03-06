/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.CompetitionDisciplineRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class CompetitionDiscipline extends TableImpl<CompetitionDisciplineRecord> {

    private static final long serialVersionUID = 2142729928;

    /**
     * The reference instance of <code>dev.competition_discipline</code>
     */
    public static final CompetitionDiscipline COMPETITION_DISCIPLINE = new CompetitionDiscipline();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompetitionDisciplineRecord> getRecordType() {
        return CompetitionDisciplineRecord.class;
    }

    /**
     * The column <code>dev.competition_discipline.competition_id</code>.
     */
    public final TableField<CompetitionDisciplineRecord, Integer> COMPETITION_ID = createField("competition_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.competition_discipline.discipline_id</code>.
     */
    public final TableField<CompetitionDisciplineRecord, Integer> DISCIPLINE_ID = createField("discipline_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dev.competition_discipline</code> table reference
     */
    public CompetitionDiscipline() {
        this("competition_discipline", null);
    }

    /**
     * Create an aliased <code>dev.competition_discipline</code> table reference
     */
    public CompetitionDiscipline(String alias) {
        this(alias, COMPETITION_DISCIPLINE);
    }

    private CompetitionDiscipline(String alias, Table<CompetitionDisciplineRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompetitionDiscipline(String alias, Table<CompetitionDisciplineRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CompetitionDisciplineRecord> getPrimaryKey() {
        return Keys.PRIMARY20;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompetitionDisciplineRecord>> getKeys() {
        return Arrays.<UniqueKey<CompetitionDisciplineRecord>>asList(Keys.PRIMARY20);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompetitionDisciplineRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompetitionDisciplineRecord, ?>>asList(Keys.COMPETITION_DISCIPLINE__COMP_DISC, Keys.COMPETITION_DISCIPLINE__DISC_COMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompetitionDiscipline as(String alias) {
        return new CompetitionDiscipline(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompetitionDiscipline rename(String name) {
        return new CompetitionDiscipline(name, null);
    }
}
