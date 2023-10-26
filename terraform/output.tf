output "rds_hostname" {
  description = "The hostname of the RDS instance"
  value       = aws_db_instance.cpb_rds.endpoint
}

output "ec2_public_dns" {
  description = "Public DNS of the EC2 instance"
  value       = aws_instance.cpb_ec2.public_dns
}