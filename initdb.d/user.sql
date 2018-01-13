CREATE TABLE IF NOT EXISTS `example`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `time` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;