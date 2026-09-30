#!/bin/bash

echo "Exercicio avaliativo de Sistemas Operacionais II"
echo "Digite o nome do usuario"
read usuario

echo "A senha será a mesma do usuário?"
read senhaigual

if [[ $senhaigual -eq 1 ]]
then
    echo "Senha adicionada com sucesso (login do usuario)"
    sudo passwd "$usuario"
else
    echo "Digite uma nova senha"
fi

sudo adduser --home /home/default "$usuario"
sudo passwd "$usuario"