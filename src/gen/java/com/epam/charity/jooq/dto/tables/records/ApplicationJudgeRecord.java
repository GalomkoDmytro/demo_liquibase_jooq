/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables.records;


import com.epam.charity.jooq.dto.tables.ApplicationJudge;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ApplicationJudgeRecord extends UpdatableRecordImpl<ApplicationJudgeRecord> implements Record3<Integer, Integer, Double> {

    private static final long serialVersionUID = -1508734235;

    /**
     * Setter for <code>dev.application_judge.application_id</code>.
     */
    public void setApplicationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev.application_judge.application_id</code>.
     */
    public Integer getApplicationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev.application_judge.judge_id</code>.
     */
    public void setJudgeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev.application_judge.judge_id</code>.
     */
    public Integer getJudgeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dev.application_judge.grade</code>.
     */
    public void setGrade(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev.application_judge.grade</code>.
     */
    public Double getGrade() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ApplicationJudge.APPLICATION_JUDGE.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ApplicationJudge.APPLICATION_JUDGE.JUDGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return ApplicationJudge.APPLICATION_JUDGE.GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getJudgeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationJudgeRecord value1(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationJudgeRecord value2(Integer value) {
        setJudgeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationJudgeRecord value3(Double value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationJudgeRecord values(Integer value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationJudgeRecord
     */
    public ApplicationJudgeRecord() {
        super(ApplicationJudge.APPLICATION_JUDGE);
    }

    /**
     * Create a detached, initialised ApplicationJudgeRecord
     */
    public ApplicationJudgeRecord(Integer applicationId, Integer judgeId, Double grade) {
        super(ApplicationJudge.APPLICATION_JUDGE);

        set(0, applicationId);
        set(1, judgeId);
        set(2, grade);
    }
}
