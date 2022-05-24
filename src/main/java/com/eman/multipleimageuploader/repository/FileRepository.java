package com.eman.multipleimageuploader.repository;

import com.eman.multipleimageuploader.model.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileInfo, Long> {
}
