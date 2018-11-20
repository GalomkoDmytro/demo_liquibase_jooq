/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto;


import com.epam.charity.jooq.dto.tables.Competition;
import com.epam.charity.jooq.dto.tables.Databasechangeloglock;
import com.epam.charity.jooq.dto.tables.records.CompetitionRecord;
import com.epam.charity.jooq.dto.tables.records.DatabasechangeloglockRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>dev</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CompetitionRecord, Long> IDENTITY_COMPETITION = Identities0.IDENTITY_COMPETITION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CompetitionRecord> ID = UniqueKeys0.ID;
    public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = UniqueKeys0.PK_DATABASECHANGELOGLOCK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CompetitionRecord, Long> IDENTITY_COMPETITION = createIdentity(Competition.COMPETITION, Competition.COMPETITION.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CompetitionRecord> ID = createUniqueKey(Competition.COMPETITION, "id", Competition.COMPETITION.ID);
        public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "pk_databasechangeloglock", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
    }
}