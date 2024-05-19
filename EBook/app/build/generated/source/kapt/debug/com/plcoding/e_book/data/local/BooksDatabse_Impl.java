package com.plcoding.e_book.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BooksDatabse_Impl extends BooksDatabse {
  private volatile BooksDao _booksDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `Result` (`authors` TEXT NOT NULL, `available` INTEGER NOT NULL, `bookQuantity` INTEGER NOT NULL, `createAt` TEXT NOT NULL, `createBy` TEXT NOT NULL, `description` TEXT NOT NULL, `discount` INTEGER NOT NULL, `feedback` TEXT NOT NULL, `galleryManage` TEXT NOT NULL, `hot` INTEGER NOT NULL, `id` INTEGER, `isebook` INTEGER NOT NULL, `isvip` INTEGER NOT NULL, `language` TEXT, `num_pages` INTEGER NOT NULL, `price` INTEGER NOT NULL, `provider` TEXT, `publication_date` TEXT NOT NULL, `publisher` TEXT, `readingsession` INTEGER NOT NULL, `title` TEXT NOT NULL, `total_pay` INTEGER NOT NULL, `updateAt` TEXT NOT NULL, `updateBy` TEXT NOT NULL, `category` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8b4c4b73d500dc291e7f2b40e8c590cd')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `Result`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsResult = new HashMap<String, TableInfo.Column>(25);
        _columnsResult.put("authors", new TableInfo.Column("authors", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("bookQuantity", new TableInfo.Column("bookQuantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("createAt", new TableInfo.Column("createAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("createBy", new TableInfo.Column("createBy", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("discount", new TableInfo.Column("discount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("feedback", new TableInfo.Column("feedback", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("galleryManage", new TableInfo.Column("galleryManage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("hot", new TableInfo.Column("hot", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("isebook", new TableInfo.Column("isebook", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("isvip", new TableInfo.Column("isvip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("language", new TableInfo.Column("language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("num_pages", new TableInfo.Column("num_pages", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("provider", new TableInfo.Column("provider", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("publication_date", new TableInfo.Column("publication_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("publisher", new TableInfo.Column("publisher", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("readingsession", new TableInfo.Column("readingsession", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("total_pay", new TableInfo.Column("total_pay", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("updateAt", new TableInfo.Column("updateAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("updateBy", new TableInfo.Column("updateBy", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResult.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResult = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResult = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResult = new TableInfo("Result", _columnsResult, _foreignKeysResult, _indicesResult);
        final TableInfo _existingResult = TableInfo.read(db, "Result");
        if (!_infoResult.equals(_existingResult)) {
          return new RoomOpenHelper.ValidationResult(false, "Result(com.plcoding.e_book.domain.model.Books.Result).\n"
                  + " Expected:\n" + _infoResult + "\n"
                  + " Found:\n" + _existingResult);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8b4c4b73d500dc291e7f2b40e8c590cd", "e1c8f1db16b4328ff8c88a34be72c916");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Result");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Result`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BooksDao.class, BooksDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public BooksDao getBooksDao() {
    if (_booksDao != null) {
      return _booksDao;
    } else {
      synchronized(this) {
        if(_booksDao == null) {
          _booksDao = new BooksDao_Impl(this);
        }
        return _booksDao;
      }
    }
  }
}
