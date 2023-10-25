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

