/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables.records;


import com.epam.charity.jooq.dto.tables.MusicDiscipline;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MusicDisciplineRecord extends UpdatableRecordImpl<MusicDisciplineRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1936995443;

    /**
     * Setter for <code>dev.music_discipline.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev.music_discipline.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev.music_discipline.discipline</code>.
     */
    public void setDiscipline(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev.music_discipline.discipline</code>.
     */
    public String getDiscipline() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MusicDiscipline.MUSIC_DISCIPLINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MusicDiscipline.MUSIC_DISCIPLINE.DISCIPLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDiscipline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicDisciplineRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicDisciplineRecord value2(String value) {
        setDiscipline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MusicDisciplineRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MusicDisciplineRecord
     */
    public MusicDisciplineRecord() {
        super(MusicDiscipline.MUSIC_DISCIPLINE);
    }

    /**
     * Create a detached, initialised MusicDisciplineRecord
     */
    public MusicDisciplineRecord(Integer id, String discipline) {
        super(MusicDiscipline.MUSIC_DISCIPLINE);

        set(0, id);
        set(1, discipline);
    }
}
