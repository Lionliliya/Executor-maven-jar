package com.kiev.java;

import java.util.List;


public class ExecutorProxy<T> implements Executor<T> {

    private Executor<T> executor;

    @Override
    public void addTask(Task<? extends T> task) {
        executor.addTask(task);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {
        executor.addTask(task, validator);
    }

    @Override
    public void execute() {
        System.out.println("ExecutorProxy before executing");
        executor.execute();
        System.out.println("ExecutorProxy after executing");
    }

    @Override
    public List<T> getValidResults() throws Exception {
        return executor.getValidResults();
    }

    @Override
    public List<T> getInvalidResults() throws Exception {
        return executor.getInvalidResults();
    }

    public void setExecutor(Executor<T> executor) {
        this.executor = executor;
    }
}
