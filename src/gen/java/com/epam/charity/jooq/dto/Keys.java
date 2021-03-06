/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto;


import com.epam.charity.jooq.dto.tables.Address;
import com.epam.charity.jooq.dto.tables.Application;
import com.epam.charity.jooq.dto.tables.ApplicationJudge;
import com.epam.charity.jooq.dto.tables.Category;
import com.epam.charity.jooq.dto.tables.Competition;
import com.epam.charity.jooq.dto.tables.CompetitionApplication;
import com.epam.charity.jooq.dto.tables.CompetitionDiscipline;
import com.epam.charity.jooq.dto.tables.CompetitionJudge;
import com.epam.charity.jooq.dto.tables.CompetitonCategory;
import com.epam.charity.jooq.dto.tables.Databasechangeloglock;
import com.epam.charity.jooq.dto.tables.Judge;
import com.epam.charity.jooq.dto.tables.MusicDiscipline;
import com.epam.charity.jooq.dto.tables.Video;
import com.epam.charity.jooq.dto.tables.records.AddressRecord;
import com.epam.charity.jooq.dto.tables.records.ApplicationJudgeRecord;
import com.epam.charity.jooq.dto.tables.records.ApplicationRecord;
import com.epam.charity.jooq.dto.tables.records.CategoryRecord;
import com.epam.charity.jooq.dto.tables.records.CompetitionApplicationRecord;
import com.epam.charity.jooq.dto.tables.records.CompetitionDisciplineRecord;
import com.epam.charity.jooq.dto.tables.records.CompetitionJudgeRecord;
import com.epam.charity.jooq.dto.tables.records.CompetitionRecord;
import com.epam.charity.jooq.dto.tables.records.CompetitonCategoryRecord;
import com.epam.charity.jooq.dto.tables.records.DatabasechangeloglockRecord;
import com.epam.charity.jooq.dto.tables.records.JudgeRecord;
import com.epam.charity.jooq.dto.tables.records.MusicDisciplineRecord;
import com.epam.charity.jooq.dto.tables.records.VideoRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
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

    public static final Identity<ApplicationRecord, Integer> IDENTITY_APPLICATION = Identities0.IDENTITY_APPLICATION;
    public static final Identity<CompetitionRecord, Integer> IDENTITY_COMPETITION = Identities0.IDENTITY_COMPETITION;
    public static final Identity<JudgeRecord, Integer> IDENTITY_JUDGE = Identities0.IDENTITY_JUDGE;
    public static final Identity<MusicDisciplineRecord, Integer> IDENTITY_MUSIC_DISCIPLINE = Identities0.IDENTITY_MUSIC_DISCIPLINE;
    public static final Identity<VideoRecord, Integer> IDENTITY_VIDEO = Identities0.IDENTITY_VIDEO;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AddressRecord> PRIMARY12 = UniqueKeys0.PRIMARY12;
    public static final UniqueKey<ApplicationRecord> PRIMARY15 = UniqueKeys0.PRIMARY15;
    public static final UniqueKey<ApplicationJudgeRecord> PRIMARY17 = UniqueKeys0.PRIMARY17;
    public static final UniqueKey<CategoryRecord> PRIMARY13 = UniqueKeys0.PRIMARY13;
    public static final UniqueKey<CompetitionRecord> PRIMARY18 = UniqueKeys0.PRIMARY18;
    public static final UniqueKey<CompetitionApplicationRecord> PRIMARY19 = UniqueKeys0.PRIMARY19;
    public static final UniqueKey<CompetitionDisciplineRecord> PRIMARY20 = UniqueKeys0.PRIMARY20;
    public static final UniqueKey<CompetitionJudgeRecord> PRIMARY21 = UniqueKeys0.PRIMARY21;
    public static final UniqueKey<CompetitonCategoryRecord> PRIMARY22 = UniqueKeys0.PRIMARY22;
    public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = UniqueKeys0.PK_DATABASECHANGELOGLOCK;
    public static final UniqueKey<JudgeRecord> PRIMARY16 = UniqueKeys0.PRIMARY16;
    public static final UniqueKey<MusicDisciplineRecord> PRIMARY14 = UniqueKeys0.PRIMARY14;
    public static final UniqueKey<VideoRecord> PRIMARY23 = UniqueKeys0.PRIMARY23;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ApplicationRecord, CategoryRecord> APPLICATION__APPLICATION_CATEGORY = ForeignKeys0.APPLICATION__APPLICATION_CATEGORY;
    public static final ForeignKey<ApplicationRecord, AddressRecord> APPLICATION__APPLICATION_ADDRESS = ForeignKeys0.APPLICATION__APPLICATION_ADDRESS;
    public static final ForeignKey<ApplicationRecord, MusicDisciplineRecord> APPLICATION__APPLICATION_DISCIPLINE = ForeignKeys0.APPLICATION__APPLICATION_DISCIPLINE;
    public static final ForeignKey<ApplicationJudgeRecord, ApplicationRecord> APPLICATION_JUDGE__APPLIATION_APPLICATION = ForeignKeys0.APPLICATION_JUDGE__APPLIATION_APPLICATION;
    public static final ForeignKey<ApplicationJudgeRecord, JudgeRecord> APPLICATION_JUDGE__APPLICATION_JUDGE = ForeignKeys0.APPLICATION_JUDGE__APPLICATION_JUDGE;
    public static final ForeignKey<CompetitionApplicationRecord, CompetitionRecord> COMPETITION_APPLICATION__COMP_ID = ForeignKeys0.COMPETITION_APPLICATION__COMP_ID;
    public static final ForeignKey<CompetitionApplicationRecord, ApplicationRecord> COMPETITION_APPLICATION__APPL_ID = ForeignKeys0.COMPETITION_APPLICATION__APPL_ID;
    public static final ForeignKey<CompetitionDisciplineRecord, CompetitionRecord> COMPETITION_DISCIPLINE__COMP_DISC = ForeignKeys0.COMPETITION_DISCIPLINE__COMP_DISC;
    public static final ForeignKey<CompetitionDisciplineRecord, MusicDisciplineRecord> COMPETITION_DISCIPLINE__DISC_COMP = ForeignKeys0.COMPETITION_DISCIPLINE__DISC_COMP;
    public static final ForeignKey<CompetitionJudgeRecord, CompetitionRecord> COMPETITION_JUDGE__COMPETITION_COMPETITION = ForeignKeys0.COMPETITION_JUDGE__COMPETITION_COMPETITION;
    public static final ForeignKey<CompetitionJudgeRecord, JudgeRecord> COMPETITION_JUDGE__COMPETITION_JUDGE = ForeignKeys0.COMPETITION_JUDGE__COMPETITION_JUDGE;
    public static final ForeignKey<CompetitonCategoryRecord, CompetitionRecord> COMPETITON_CATEGORY__COMP_COMPETITION = ForeignKeys0.COMPETITON_CATEGORY__COMP_COMPETITION;
    public static final ForeignKey<CompetitonCategoryRecord, CategoryRecord> COMPETITON_CATEGORY__CATEG_CATEGORY = ForeignKeys0.COMPETITON_CATEGORY__CATEG_CATEGORY;
    public static final ForeignKey<VideoRecord, ApplicationRecord> VIDEO__VIDEO_APPLICATION = ForeignKeys0.VIDEO__VIDEO_APPLICATION;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ApplicationRecord, Integer> IDENTITY_APPLICATION = createIdentity(Application.APPLICATION, Application.APPLICATION.ID);
        public static Identity<CompetitionRecord, Integer> IDENTITY_COMPETITION = createIdentity(Competition.COMPETITION, Competition.COMPETITION.ID);
        public static Identity<JudgeRecord, Integer> IDENTITY_JUDGE = createIdentity(Judge.JUDGE, Judge.JUDGE.ID);
        public static Identity<MusicDisciplineRecord, Integer> IDENTITY_MUSIC_DISCIPLINE = createIdentity(MusicDiscipline.MUSIC_DISCIPLINE, MusicDiscipline.MUSIC_DISCIPLINE.ID);
        public static Identity<VideoRecord, Integer> IDENTITY_VIDEO = createIdentity(Video.VIDEO, Video.VIDEO.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AddressRecord> PRIMARY12 = createUniqueKey(Address.ADDRESS, "primary12", Address.ADDRESS.ID);
        public static final UniqueKey<ApplicationRecord> PRIMARY15 = createUniqueKey(Application.APPLICATION, "primary15", Application.APPLICATION.ID);
        public static final UniqueKey<ApplicationJudgeRecord> PRIMARY17 = createUniqueKey(ApplicationJudge.APPLICATION_JUDGE, "primary17", ApplicationJudge.APPLICATION_JUDGE.APPLICATION_ID, ApplicationJudge.APPLICATION_JUDGE.JUDGE_ID);
        public static final UniqueKey<CategoryRecord> PRIMARY13 = createUniqueKey(Category.CATEGORY, "primary13", Category.CATEGORY.ID);
        public static final UniqueKey<CompetitionRecord> PRIMARY18 = createUniqueKey(Competition.COMPETITION, "primary18", Competition.COMPETITION.ID);
        public static final UniqueKey<CompetitionApplicationRecord> PRIMARY19 = createUniqueKey(CompetitionApplication.COMPETITION_APPLICATION, "primary19", CompetitionApplication.COMPETITION_APPLICATION.COMPETITION, CompetitionApplication.COMPETITION_APPLICATION.APPLICATION);
        public static final UniqueKey<CompetitionDisciplineRecord> PRIMARY20 = createUniqueKey(CompetitionDiscipline.COMPETITION_DISCIPLINE, "primary20", CompetitionDiscipline.COMPETITION_DISCIPLINE.COMPETITION_ID, CompetitionDiscipline.COMPETITION_DISCIPLINE.DISCIPLINE_ID);
        public static final UniqueKey<CompetitionJudgeRecord> PRIMARY21 = createUniqueKey(CompetitionJudge.COMPETITION_JUDGE, "primary21", CompetitionJudge.COMPETITION_JUDGE.COMPETITION_ID, CompetitionJudge.COMPETITION_JUDGE.JUDGE_ID);
        public static final UniqueKey<CompetitonCategoryRecord> PRIMARY22 = createUniqueKey(CompetitonCategory.COMPETITON_CATEGORY, "primary22", CompetitonCategory.COMPETITON_CATEGORY.COMPETITION_ID, CompetitonCategory.COMPETITON_CATEGORY.CATEGORY_ID);
        public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "pk_databasechangeloglock", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<JudgeRecord> PRIMARY16 = createUniqueKey(Judge.JUDGE, "primary16", Judge.JUDGE.ID);
        public static final UniqueKey<MusicDisciplineRecord> PRIMARY14 = createUniqueKey(MusicDiscipline.MUSIC_DISCIPLINE, "primary14", MusicDiscipline.MUSIC_DISCIPLINE.ID);
        public static final UniqueKey<VideoRecord> PRIMARY23 = createUniqueKey(Video.VIDEO, "primary23", Video.VIDEO.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<ApplicationRecord, CategoryRecord> APPLICATION__APPLICATION_CATEGORY = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY13, Application.APPLICATION, "application__application_category", Application.APPLICATION.CATEGORY_ID);
        public static final ForeignKey<ApplicationRecord, AddressRecord> APPLICATION__APPLICATION_ADDRESS = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY12, Application.APPLICATION, "application__application_address", Application.APPLICATION.ADDRESS_ID);
        public static final ForeignKey<ApplicationRecord, MusicDisciplineRecord> APPLICATION__APPLICATION_DISCIPLINE = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY14, Application.APPLICATION, "application__application_discipline", Application.APPLICATION.MUSIC_DISCIPLINE_ID);
        public static final ForeignKey<ApplicationJudgeRecord, ApplicationRecord> APPLICATION_JUDGE__APPLIATION_APPLICATION = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY15, ApplicationJudge.APPLICATION_JUDGE, "application_judge__appliation_application", ApplicationJudge.APPLICATION_JUDGE.APPLICATION_ID);
        public static final ForeignKey<ApplicationJudgeRecord, JudgeRecord> APPLICATION_JUDGE__APPLICATION_JUDGE = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY16, ApplicationJudge.APPLICATION_JUDGE, "application_judge__application_judge", ApplicationJudge.APPLICATION_JUDGE.JUDGE_ID);
        public static final ForeignKey<CompetitionApplicationRecord, CompetitionRecord> COMPETITION_APPLICATION__COMP_ID = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY18, CompetitionApplication.COMPETITION_APPLICATION, "competition_application__comp_id", CompetitionApplication.COMPETITION_APPLICATION.COMPETITION);
        public static final ForeignKey<CompetitionApplicationRecord, ApplicationRecord> COMPETITION_APPLICATION__APPL_ID = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY15, CompetitionApplication.COMPETITION_APPLICATION, "competition_application__appl_id", CompetitionApplication.COMPETITION_APPLICATION.APPLICATION);
        public static final ForeignKey<CompetitionDisciplineRecord, CompetitionRecord> COMPETITION_DISCIPLINE__COMP_DISC = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY18, CompetitionDiscipline.COMPETITION_DISCIPLINE, "competition_discipline__comp_disc", CompetitionDiscipline.COMPETITION_DISCIPLINE.COMPETITION_ID);
        public static final ForeignKey<CompetitionDisciplineRecord, MusicDisciplineRecord> COMPETITION_DISCIPLINE__DISC_COMP = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY14, CompetitionDiscipline.COMPETITION_DISCIPLINE, "competition_discipline__disc_comp", CompetitionDiscipline.COMPETITION_DISCIPLINE.DISCIPLINE_ID);
        public static final ForeignKey<CompetitionJudgeRecord, CompetitionRecord> COMPETITION_JUDGE__COMPETITION_COMPETITION = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY18, CompetitionJudge.COMPETITION_JUDGE, "competition_judge__competition_competition", CompetitionJudge.COMPETITION_JUDGE.COMPETITION_ID);
        public static final ForeignKey<CompetitionJudgeRecord, JudgeRecord> COMPETITION_JUDGE__COMPETITION_JUDGE = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY16, CompetitionJudge.COMPETITION_JUDGE, "competition_judge__competition_judge", CompetitionJudge.COMPETITION_JUDGE.JUDGE_ID);
        public static final ForeignKey<CompetitonCategoryRecord, CompetitionRecord> COMPETITON_CATEGORY__COMP_COMPETITION = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY18, CompetitonCategory.COMPETITON_CATEGORY, "competiton_category__comp_competition", CompetitonCategory.COMPETITON_CATEGORY.COMPETITION_ID);
        public static final ForeignKey<CompetitonCategoryRecord, CategoryRecord> COMPETITON_CATEGORY__CATEG_CATEGORY = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY13, CompetitonCategory.COMPETITON_CATEGORY, "competiton_category__categ_category", CompetitonCategory.COMPETITON_CATEGORY.CATEGORY_ID);
        public static final ForeignKey<VideoRecord, ApplicationRecord> VIDEO__VIDEO_APPLICATION = createForeignKey(com.epam.charity.jooq.dto.Keys.PRIMARY15, Video.VIDEO, "video__video_application", Video.VIDEO.APPLICATION_ID);
    }
}
