package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.solamly.solamly.module.download.FileBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FILE_BEAN".
*/
public class FileBeanDao extends AbstractDao<FileBean, Long> {

    public static final String TABLENAME = "FILE_BEAN";

    /**
     * Properties of entity FileBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Url = new Property(2, String.class, "url", false, "URL");
        public final static Property Length = new Property(3, int.class, "length", false, "LENGTH");
        public final static Property DirPath = new Property(4, String.class, "dirPath", false, "DIR_PATH");
        public final static Property StartNode = new Property(5, int.class, "startNode", false, "START_NODE");
    }


    public FileBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FileBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FILE_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"URL\" TEXT," + // 2: url
                "\"LENGTH\" INTEGER NOT NULL ," + // 3: length
                "\"DIR_PATH\" TEXT," + // 4: dirPath
                "\"START_NODE\" INTEGER NOT NULL );"); // 5: startNode
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FILE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FileBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
        stmt.bindLong(4, entity.getLength());
 
        String dirPath = entity.getDirPath();
        if (dirPath != null) {
            stmt.bindString(5, dirPath);
        }
        stmt.bindLong(6, entity.getStartNode());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FileBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
        stmt.bindLong(4, entity.getLength());
 
        String dirPath = entity.getDirPath();
        if (dirPath != null) {
            stmt.bindString(5, dirPath);
        }
        stmt.bindLong(6, entity.getStartNode());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public FileBean readEntity(Cursor cursor, int offset) {
        FileBean entity = new FileBean( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // url
            cursor.getInt(offset + 3), // length
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // dirPath
            cursor.getInt(offset + 5) // startNode
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FileBean entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLength(cursor.getInt(offset + 3));
        entity.setDirPath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStartNode(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FileBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FileBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FileBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
