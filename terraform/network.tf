resource "aws_vpc" "cpb_vpc" {
  cidr_block = "10.0.0.0/16"
  tags = {
    Name = "capibytes_vpc"
  }
}

resource "aws_subnet" "cpb_subnet" {
  vpc_id     = aws_vpc.cpb_vpc.id
  cidr_block = "10.0.1.0/24"
  tags = {
    Name = "capibytes_subnet"
  }
} 

resource "aws_db_subnet_group" "my_db_subnet_group" {
  name       = "my_db_subnet_group"
  subnet_ids = [aws_subnet.cpb_subnet.id]

  tags = {
    Name = "CapiBytes RDS subnet group"
  }
}

resource "aws_db_instance" "my_postgres_db" {
  allocated_storage    = 100  # Gibibytes
  storage_type         = "gp2"
  engine               = "postgres"
  engine_version       = "15.4"
  instance_class       = "db.t2.micro"
  db_name              = "mydatabase"
  username             = "mydbuser"
  password             = "mypassword"
  parameter_group_name = "default.postgres13"
  skip_final_snapshot  = true

  # Open to external connections (not recommended for production)
  publicly_accessible = true

  vpc_security_group_ids = [aws_security_group.rds_sg.id]
  db_subnet_group_name   = aws_db_subnet_group.my_db_subnet_group.name

  tags = {
    Name = "MyPostgresDB"
  }
}

