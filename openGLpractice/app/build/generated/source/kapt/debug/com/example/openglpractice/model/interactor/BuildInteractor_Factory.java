// Generated by Dagger (https://google.github.io/dagger).
package com.example.openglpractice.model.interactor;

import dagger.internal.Factory;

public final class BuildInteractor_Factory implements Factory<BuildInteractor> {
  private static final BuildInteractor_Factory INSTANCE = new BuildInteractor_Factory();

  @Override
  public BuildInteractor get() {
    return new BuildInteractor();
  }

  public static BuildInteractor_Factory create() {
    return INSTANCE;
  }
}