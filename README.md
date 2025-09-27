# Back 
docker-compose.yml
'''
version: '3.8'
services:
  postgres:
    image: postgres:15
    container_name: usuarios
    environment:
      POSTGRES_USER: usuarios
      POSTGRES_PASSWORD: 54321
      POSTGRES_DB: usuarios
    ports:
      - "5433:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
 
volumes:
  postgres_data:
    driver: local
'''
