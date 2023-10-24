variable "db_username" {
  description = "Username for the database"
  type = string
  sensitive = true
}

variable "db_password" {
  description = "Password for the database"
  type = string
  sensitive = true
}

variable "TFC_AWS_PROVIDER_AUTH" {
  
}

variable "TFC_AWS_RUN_ROLE_ARN" {
    
}

locals {
  region = "us-east-1"
  app_name = "datalytics"
  team_name = "CapiBytes"
}