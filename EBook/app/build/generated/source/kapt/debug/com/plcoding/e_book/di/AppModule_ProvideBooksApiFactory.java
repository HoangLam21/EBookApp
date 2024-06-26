// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book.di;

import com.plcoding.e_book.data.remote.BooksApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideBooksApiFactory implements Factory<BooksApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideBooksApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public BooksApi get() {
    return provideBooksApi(retrofitProvider.get());
  }

  public static AppModule_ProvideBooksApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideBooksApiFactory(retrofitProvider);
  }

  public static BooksApi provideBooksApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBooksApi(retrofit));
  }
}
