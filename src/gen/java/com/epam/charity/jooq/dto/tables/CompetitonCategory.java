/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.CompetitonCategoryRecord;

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
public class CompetitonCategory extends TableImpl<CompetitonCategoryRecord> {

    private static final long serialVersionUID = 2112232790;

    /**
     * The reference instance of <code>dev.competiton_category</code>
     */
    public static final CompetitonCategory COMPETITON_CATEGORY = new CompetitonCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompetitonCategoryRecord> getRecordType() {
        return CompetitonCategoryRecord.class;
    }

    /**
     * The column <code>dev.competiton_category.competition_id</code>.
     */
    public final TableField<CompetitonCategoryRecord, Integer> COMPETITION_ID = createField("competition_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.competiton_category.category_id</code>.
     */
    public final TableField<CompetitonCategoryRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dev.competiton_category</code> table reference
     */
    public CompetitonCategory() {
        this("competiton_category", null);
    }

    /**
     * Create an aliased <code>dev.competiton_category</code> table reference
     */
    public CompetitonCategory(String alias) {
        this(alias, COMPETITON_CATEGORY);
    }

    private CompetitonCategory(String alias, Table<CompetitonCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompetitonCategory(String alias, Table<CompetitonCategoryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CompetitonCategoryRecord> getPrimaryKey() {
        return Keys.PRIMARY22;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompetitonCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<CompetitonCategoryRecord>>asList(Keys.PRIMARY22);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompetitonCategoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompetitonCategoryRecord, ?>>asList(Keys.COMPETITON_CATEGORY__COMP_COMPETITION, Keys.COMPETITON_CATEGORY__CATEG_CATEGORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompetitonCategory as(String alias) {
        return new CompetitonCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompetitonCategory rename(String name) {
        return new CompetitonCategory(name, null);
    }
}
