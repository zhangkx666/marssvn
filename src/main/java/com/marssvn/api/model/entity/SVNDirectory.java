package com.marssvn.api.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SVNDirectory extends Entity {

    /**
     * file type
     */
    private String type = "dir";

    /**
     * directory name
     */
    private String name;

    /**
     * svn directory path
     */
    private String path;

    /**
     * full path
     */
    private String fullPath;

    /**
     * revision
     */
    private long revision;

    /**
     * author
     */
    private String author;

    /**
     * date
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    /**
     * commit message
     */
    private String commitMessage;

    /**
     * files
     */
    private List<SVNFile> files;

    /**
     * sub directories
     */
    private List<SVNDirectory> children;
}
