package com.spoorthy.taskmanager.repository;

import com.spoorthy.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}