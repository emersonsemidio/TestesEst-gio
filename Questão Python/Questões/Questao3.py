import pandas as pd
import numpy as np

df = pd.read_json('faturamento.json')

df_sem_dias_zerados = df[df['valor'] > 0]

menor_faturamento_diario = df['valor'].min()
maior_faturamento_diario = df['valor'].max()

media_faturamento = df_sem_dias_zerados['valor'].mean()

dias_com_faturamento_acima_media = df_sem_dias_zerados[df_sem_dias_zerados['valor'] > media_faturamento].count()

print(f"Média de faturamento: {media_faturamento:.2f}")
print(f"Menor valor de faturamento: {menor_faturamento_diario}")
print(f"Maior valor de faturamento: {maior_faturamento_diario}")
print(f"Número de dias com faturamento acima da média: {dias_com_faturamento_acima_media}")

