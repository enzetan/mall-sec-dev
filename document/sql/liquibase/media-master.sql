CREATE TABLE IF NOT EXISTS `media_master_file`
(
    `id`         int(11)      NOT NULL AUTO_INCREMENT,
    `name`       varchar(255) NOT NULL,
    `path`       varchar(255) NOT NULL,
    `type`       varchar(255) NOT NULL,
    `size`       int(11)      NOT NULL,
    `created_at` datetime     NOT NULL,
    `updated_at` datetime     NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  AUTO_INCREMENT = 1;