resource "aws_db_instance" "cpb_rds" {
  allocated_storage    = 100  # Change this based on your needs
  storage_type         = "gp2"
  engine               = "postgres"
  engine_version       = "15.4"
  instance_class       = "db.t2.micro"
  db_name              = local.app_name
  username             = 
  password             = 
  skip_final_snapshot  = true

  # Open to external connections (not recommended for production)
  publicly_accessible = true

  vpc_security_group_ids = [aws_security_group.rds_sg.id]
  db_subnet_group_name   = aws_db_subnet_group.rds_subnet_group.name

  tags = {
    Env = "dev"
    Equipe = local.team_name
  }
}

resource "aws_security_group" "rds_sg" {
  name        = "Capibytes_RDS_SG"
  description = "Allow all inbound traffic to PostgreSQL"
  vpc_id      = aws_vpc.cpb_vpc.id

  ingress {
    from_port   = 5432
    to_port     = 5432
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"] # Allows connection from anywhere
  }
}

resource "aws_db_subnet_group" "rds_subnet_group" {
  name       = "CapiBytes_RDS_subnet_group"
  subnet_ids = [aws_subnet.cpb_subnet.id]

  tags = {
    Env = "dev"
    Equipe = local.team_name
  }
}