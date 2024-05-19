// Generated by Dagger (https://dagger.dev).
package com.plcoding.e_book.presentation.home;

import com.plcoding.e_book.domain.usecases.book.BooksUseCase;
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<BooksUseCase> bookUseCasesProvider;

  private final Provider<CategoryUseCase> categoryUseCasesProvider;

  public HomeViewModel_Factory(Provider<BooksUseCase> bookUseCasesProvider,
      Provider<CategoryUseCase> categoryUseCasesProvider) {
    this.bookUseCasesProvider = bookUseCasesProvider;
    this.categoryUseCasesProvider = categoryUseCasesProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(bookUseCasesProvider.get(), categoryUseCasesProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<BooksUseCase> bookUseCasesProvider,
      Provider<CategoryUseCase> categoryUseCasesProvider) {
    return new HomeViewModel_Factory(bookUseCasesProvider, categoryUseCasesProvider);
  }

  public static HomeViewModel newInstance(BooksUseCase bookUseCases,
      CategoryUseCase categoryUseCases) {
    return new HomeViewModel(bookUseCases, categoryUseCases);
  }
}
