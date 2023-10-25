resource "aws_vpc" "cpb_vpc" {
  cidr_block = "10.0.0.0/16"
  tags = {
    Name = "capibytes_vpc"
  }
}

resource "aws_subnet" "cpb_subnet1" {
  vpc_id     = aws_vpc.cpb_vpc.id
  cidr_block = "10.0.1.0/24"
  availability_zone = "us-east-1a"
  tags = {
    Name = "capibytes_subnet1"
  }
} 

resource "aws_subnet" "cpb_subnet2" {
  vpc_id     = aws_vpc.cpb_vpc.id
  cidr_block = "10.0.1.0/24"
  availability_zone = "us-east-1b"
  tags = {
    Name = "capibytes_subnet2"
  }
} 