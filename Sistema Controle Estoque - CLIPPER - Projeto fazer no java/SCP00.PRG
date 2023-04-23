************************************************
*     SCP00 - SISTEMA CONTROLE ENTRADAS SAIDAS *
*           - TELA PRINCIPAL -                 *
*                                              *
* Desenvolvido por: ACE INFORMµTICA            *
* In°cio: 11/01/2006                           *
************************************************

*** Comandos de configuraá∆o ***

*cid="MONJOLOS"
cid="CURVELO"
*cid="SANTO HIPOLITO"

* LEMBRETE : Qdo alterar cidades - lembrar dos diretorios corretos abaixo
*                         logo depois da linha do P00INDEX

*SETCANCEL(.f.)

set bell off
set century on
set color to 6+/0
cor_sis=setcolor()
set date brit
set score off
set delete on
set wrap on
set cursor off
set bell on
set message to 24

****************************
*if date()>ctod("30/10/2007")
*   clear
*   a="ARQUIVO CORROMPIDO"
*   b="ENTRE EM CONTATO COM O PROGRAMADOR RESPONSµVEL"
*   c="ACE INFORMµTICA"
*   d="EDERSON"
              
*   @ 01,01 say a
*   @ 11,40-len(b)/2 say b
*   @ 12,40-len(c)/2 say c
*   @ 13,40-len(d)/2 say d
*   inkey(0)

*   set  color to
*   clear
*   return
*endif

**************************

m1=" I N D I O MATERIAIS DE CONSTRUCAO "

*** Apresentaá∆o ***               

clear

tit1=" €€€€€ €€€€ €€€€ "
tit2=" €€    €€   €€   "
tit3=" €€    €€   €€   "
tit4="  €€€€ €€   €€€   "
tit5="    €€ €€   €€   "
tit6=" €€€€€ €€€€ €€€€ "

part1="‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹‹"

part2="ﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂﬂ"

lin1=0
lin2=4

set color to 2/0                 && In°cio da apresentaá∆o do t°tulo
@ 6,40-len(part2)/2 say part2

mm="Vers∆o 1.0"
mm2="Pressione alguma tecla para continuar! "
mm3=">>>"

set color to 2/0
@ 7,40-len(tit1)/2 say tit1

set color to 4+/0
@ 8,40-len(tit2)/2 say tit2

set color to 2/0
@ 9,40-len(tit3)/2 say tit3

set color to 4+/0
@ 10,40-len(tit4)/2 say tit4

set color to 2/0
@ 11,40-len(tit5)/2 say tit5

set color to 4+/0
@ 12,40-len(tit6)/2 say tit6

@ 17,17 say "SISTEMA CONTROLE ESTOQUE - ENTRADAS/SAIDAS - "+cid
@ 18,17 say mm

@ 15,40-len(part1)/2 say part1    && Fim da apresentaá∆o do t°tulo
set color to 2+/0
@ 24,40-len(mm2)/2 say mm2
set color to 7+*/0
@ 24,59 say mm3
inkey(0)      

set color to 7/0
clear

@ 01,00 to 23,79 double        && quadro geral

set color to 7+/2
@ 02,02 clear to 05,77
@ 02,02 to 05,77

m2="SISTEMA CONTROLE ENTRADAS/SAIDAS - "+cid

set color to w+/2
@ 03,40-len(TRIM(M1))/2 say TRIM(M1)

set color to 3+/2
@ 04,40-len(m2)/2 say m2

set color to w+/2
@ 04,04 say date()
@ 04,70 say "MENU 1"
mm="Ederson Araujo - Vers∆o 1.0 - 38 9105-0841"
@ 24,40-len(mm)/2 say mm

set color to 6+/0

sai=.f.

@ 22,03 say "Tecle <ESC> para encerrar ..."

@ 24,70 say mm

********   verifica indices

P00INDEX()
close data

******* Preenche arquivo de clientes

*select 1
*use SCA03 index SCI01A03, SCI02A03 alias cli
*zap
*
**!cd\monjolos
**!cd\curvelo
*!cd\sto_hip
*
*select 2
*use SFT01 alias cidade
*index on T01_COD to indcid
*
*select 3
*use SFA01
*go top
*
**!cd\est_mjl
**!cd\est_cvo
*!cd\est_sht
*
*do while ! eof()
*   
*    cod=A01_COD
*    nome=A01_NOME
*    ende=A01_ENDE
*    cpf=A01_CPFNPJ
*    cid=A01_CODCID
*
*    select cidade
*    seek cid
*    nomcid=T01_Descr
*
*    select cli
*    append blank
*
*    replace A03_COD with cod, A03_NOME with nome,;
*            A03_ENDE with ende, A03_CID with nomcid,;
*            A03_CPF with cpf
*
*    select 3
*    skip
*
*enddo
*
*close data

****** Verificando existància de arquivos de dados
****** e indexaá∆o de arquivos

P00INDEX()

************* MENUS

op1=0

do while ! sai

   @ 24,00
   @ 06,02 to 08,77
   @ 07,04 prompt "ESTOQUE" message "Cadastro/alteraá∆o/consulta/exclus∆o de mercadorias."
   @ 07,15 prompt "FORNECEDOR" message "Cadastro/alteraá∆o/consulta/exclus∆o de fornecedores."
   @ 07,30 prompt "CLIENTES" message "Cadastro/alteraá∆o/consulta/exclus∆o de clientes."
   @ 07,45 prompt "MOVIMENTO" message "Movimentaá∆o entrada / saida nfs/mescadoria."
   @ 07,60 prompt "RELATORIOS" message "Relat¢rio movimentaá∆o peri¢dica de mercadorias."
   menu to op1

   if lastkey()=27
      sai=.t.
      loop
   endif

   do case
      case op1=1
         save screen to t1
         do MENU11
         restore screen from t1
      case op1=2
         save screen to t1
         do MENU12
         restore screen from t1
      case op1=3
         save screen to t1
         do MENU13
         restore screen from t1
      case op1=4
         save screen to t1
         do MENU14
         restore screen from t1
      case op1=5
         save screen to t1
         do MENU15
         restore screen from t1
   endcase

enddo

close databases
set color to &cor_sis
clear

Tela_fim()
set cursor on

return

************
* MENU 1.1 *
************
Procedure MENU11

@ 24,00
set color to 7+/4
@ 04,69 say "MENU 1.1"
set color to 6+/0

sai11=.f.
op11=0

do while ! sai11

   set key 04 to P00Dir()
   set key 19 to P00Esq()

   @ 24,00
   @ 10,04,14,14 box "≤"
   @ 09,03 to 13,13
   @ 10,04 prompt "CADASTRO " message "Realiza operaá‰es referentes a cadastro de mercadorias."
   @ 11,04 prompt "ALT/CONS." message "Realiza alteraá∆o/consulta no cadastro de mercadorias."
   @ 12,04 prompt "EXCLUSµO " message "Realiza exclus∆o no cadastro de mercadorias."
   menu to op11

   set key 04 to
   set key 19 to

   if lastkey()=27
      sai11=.t.
      loop
   endif

   do case
      case op11=1
      save screen to t11
          do SCP01
      restore screen from t11
      case op11=2
      save screen to t11
         do SCP02
      restore screen from t11
      case op11=3
      save screen to t11
         do SCP03
      restore screen from t11
   endcase
         
enddo

return

************
* MENU 1.2 *
************
Procedure MENU12

@ 24,00
set color to 7+/4
@ 04,69 say "MENU 1.2"
set color to 6+/0

sai12=.f.
op12=0

do while ! sai12

   set key 04 to P00Dir()
   set key 19 to P00Esq()

   @ 24,00
   @ 10,15,14,25 box "≤"
   @ 09,14 to 13,24
   @ 10,15 prompt "CADASTRO " message "Realiza operaá‰es referentes a cadastro de fornecedores."
   @ 11,15 prompt "ALT/CONS." message "Realiza alteraá∆o/consulta no cadastro de fornecedordes."
   @ 12,15 prompt "EXCLUSµO " message "Realiza exclus∆o no cadastro de fornecedores."
   menu to op12

   set key 04 to
   set key 19 to

   if lastkey()=27
      sai12=.t.
      loop
   endif

   do case
      case op12=1
         save screen to t12
         do scp04
         restore screen from t12
      case op12=2
         save screen to t12
         do scp05
         restore screen from t12
      case op12=3
         save screen to t12
         do scp06
         restore screen from t12
   endcase

enddo

return

************
* MENU 1.3 *
************
Procedure MENU13

@ 24,00
set color to 7+/4
@ 04,69 say "MENU 1.3"
set color to 6+/0

sai13=.f.
op13=0

do while ! sai13

   set key 04 to P00Dir()
   set key 19 to P00Esq()

   @ 24,00
   @ 10,30,14,40 box "≤"
   @ 09,29 to 13,39
   @ 10,30 prompt "CADASTRO " message "Realiza operaá‰es referentes a cadastro de clientes."
   @ 11,30 prompt "ALT/CONS." message "Realiza alteraá∆o/consulta no cadastro de clientes."
   @ 12,30 prompt "EXCLUSµO " message "Realiza exclus∆o no cadastro de clientes."
   menu to op13

   set key 04 to
   set key 19 to

   if lastkey()=27
      sai13=.t.
      loop
   endif

   do case
      case op13=1
         save screen to t13
         do scp21
         restore screen from t13
      case op13=2
         save screen to t13
         do scp22
         restore screen from t13
      case op13=3
         save screen to t13
         do scp23
         restore screen from t13

   endcase

enddo

return

************
* MENU 1.4 *
************
Procedure MENU14

@ 24,00
set color to 7+/4
@ 04,69 say "MENU 1.4"
set color to 6+/0

sai14=.f.
op14=0

do while ! sai14

   set key 04 to P00Dir()
   set key 19 to P00Esq()

   @ 24,00
   @ 10,45,15,55 box "≤"
   @ 09,44 to 14,54
   @ 10,45 prompt "ENTRADAS " message "Efetua entrada de mercadorias atravÇs do lanáto de nf.."
   @ 11,45 prompt "PEDIDOS  " message "Efetua saida de mercadorias atravÇs do lanáto de nf."
   @ 12,45 prompt "CONSULTAS" message "Faz consulta mov. por clientes/fornecedores/pedidos."
   @ 13,45 prompt "ESTORNO  " message "Faz estorno de entrada / saida "
   menu to op14

   set key 04 to
   set key 19 to

   if lastkey()=27
      sai14=.t.
      loop
   endif

   do case
      case op14=1
      save screen to t14
         do SCP10
      restore screen from t14
      case op14=2
      save screen to t14
         do SCP11
      restore screen from t14
      case op14=3
      save screen to t14
         do SCP12
      restore screen from t14
      case op14=4
      save screen to t14
         do SCP17
      restore screen from t14
   endcase
         
enddo

return

************
* MENU 1.5 *
************
Procedure MENU15

@ 24,00
set color to 7+/4
@ 04,69 say "MENU 1.5"
set color to 6+/0

sai15=.f.
op15=0

do while ! sai15

   set key 04 to P00Dir()
   set key 19 to P00Esq()

   @ 24,00
   @ 10,60,15,69 box "≤"
   @ 09,59 to 14,68
   @ 10,60 prompt "ENTRADAS" message "Relat¢rio de entradas no per°odo espec°fico."
   @ 11,60 prompt "SAIDAS  " message "Relat¢rio de sa°das no per°odo espec°fico."
   @ 12,60 prompt "ESTOQUE " message "Relat¢rio de saldo de estoque."
   @ 13,60 prompt "FORNECED" message "Relat¢rio de CADASTRO DE FORNECEDORES."
   menu to op15

   set key 04 to
   set key 19 to

   if lastkey()=27
      sai15=.t.
      loop
   endif

   do case
      case op15=1
      save screen to t15
         do SCP13
      restore screen from t15

      case op15=2
      save screen to t15
         do SCP14
      restore screen from t15

      case op15=3
      save screen to t15
         do SCP15
      restore screen from t15

      case op15=4
      save screen to t15
         do SCP16
      restore screen from t15
   endcase
         
enddo

return
                   
*********************************************
* P00Dir() - Seta para a direita em um menu *
*********************************************

function P00Dir

keyboard chr(27)+chr(04)+chr(13)

return ""

**********************************************
* P00Esq() - Seta para a esquerda em um menu *
**********************************************
function P00Esq

keyboard chr(27)+chr(19)+chr(13)

return ""

***********************
* Tela de finalizaá∆o *
***********************
function Tela_fim

a="S U P O R T E : "

SET COLOR TO 6+/0
@ 08,40-len(a)/2 say a

set color to 6+/0
@ 10,10 clear to 17,70
@ 10,10 to 17,70

v1="‹‹‹‹‹ ‹‹‹‹‹ ‹‹‹‹‹"
v2="€‹‹‹€ €     €‹‹‹ "
v3="€   € €‹‹‹‹ €‹‹‹‹"
v4="I N F O R M µ T I C A"
v5="   38.9105.0841   "


@ 11,40-len(v1)/2 say v1
@ 12,40-len(v1)/2 say v2
@ 13,40-len(v1)/2 say v3
@ 14,40-len(v4)/2 say v4
set color to 6+*/0

@ 16,40-len(v1)/2 say v5

inkey(0)

set color to 
clear

return ""

****************************************************************
* Mens_erro()                                                  *
* Exibe um mensagem de erro na falta de algum arquivo de dados *
****************************************************************

function Mens_erro

parameters var

@ 06,02 clear to 22,78
set color to
@ 13,16 clear to 17,62
set color to 6+/0
@ 24,00
@ 12,15 to 16,61 double
set color to 7+*/0
@ 13,16 say mens1
set color to 6+/0
@ 14,16 say mens2
@ 15,16 say "      Contate respons†vel pelo sistema.      "
@ 24,02 say "O sistema ser† abortado. Tecle algo ..."
inkey(0)
set color to
clear

return ""

********************************************************
* Funá∆o para possibilitar a escolha de uma das turmas *
********************************************************
function P00OPTur

save screen to P00Tur

private tot_rec,var,v1,V2,V3

goto top

declare v1[3],v2[3],v3[3]
        
v1[1]="A03_DIAS"
v1[2]="A03_HORAIN"
v1[3]="A03_HORAFI"

v2[1]="@!"
v2[2]="@R 99:99"
v2[3]="@R 99:99"

v3[1]=" DIAS"
v3[2]=" HORµRIO INI."
v3[3]=" HORµRIO FIN."

@ 22,02 clear to 22,77
mens="Tecle <ENTER> para escolher"
@ 22,40-len(mens)/2 say mens

cor=setcolor()

set color to 4/3,6+/0

@ 09,09 clear to 19,71
@ 09,09 to 19,71
@ 09,31 say " CONSULTA TURMAS "

ret=dbedit(11,10,18,70,v1,,v2,v3)

if lastkey()=27
   set color to &cor
   restore screen from p00tur
   return ""
endif

codtur=A03_CODTUR

set color to &cor

restore screen from p00tur

return ""

*****************************************************************
* Funá∆o para possibilitar a escolha de um dos alunos pela CTR  *
*****************************************************************
function P00CONCTR

alias=alias()

select ALUNOS
SET ORDER TO 2
set filter to ! A01_CANCEL
save screen to P00Ctr

private tot_rec,var,v1,V2,V3

goto top

declare v1[2],v2[2],v3[2]
        
v1[1]="A01_NROCTR"
v1[2]="A01_NOMALU"

v2[1]="99999"
v2[2]="@!"

v3[1]=" NRO. CTR"
v3[2]=" NOME ALUNO"

@ 22,02 clear to 22,77
mens="Tecle <ENTER> para escolher"
@ 22,40-len(mens)/2 say mens

cor=setcolor()

set color to 4/3,6+/0

@ 09,09 clear to 19,71
@ 09,09 to 19,71
@ 09,31 say " CONSULTA ALUNOS "

ret=dbedit(11,10,18,70,v1,,v2,v3)

SET ORDER TO 1

nroctr=A01_NROCTR
codtur=A01_CODTUR

if lastkey()=27
   set color to &cor
   select &alias
   restore screen from p00Ctr
   set filter to
   set color to &cor
   return ""
endif

set color to &cor
set filter to

restore screen from p00Ctr

select &alias

return ""

******************************************************************************
* Funá∆o para bloquear uma tentativa de consulta quando j† houver uma aberta *
******************************************************************************
Function P00Bloq()

return ""

***************************************
* P00Som() - Funá∆o para gerar um som *
***************************************
function P00Som

tone(1000,0)
tone(2000,0)
tone(3000,0)
tone(4000,0)
tone(5000,0)
tone(6000,0)

return ""

***************************************
* P00Som() - Funá∆o para gerar um som *
***************************************
function P00INDEX

****** Verificando existància de arquivos de dados
****** e indexaá∆o de arquivos

!del *.ntx

m="* AGUARDE REINDEXAÄ«O DE ARQUIVOS *"
@ 13,40-len(m)/2 say m

************ SFA01

if ! file("SFA01.DBF")
   mens1="      Arquivo de clientes n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SFI01A01.NTX")
   use SFA01.DBF
   index on A01_COD to SFI01A01.NTX
   close databases
endif

if ! file("SFI02A01.NTX")
   use SFA01.DBF
   index on A01_NOME to SFI02A01.NTX
   close databases
endif 

************ SCA01

if ! file("SCA01.DBF")
   mens1="      Arquivo de MERCADORIAS n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SCI01A01.NTX")
   use SCA01.DBF
   index on A01_CODPRO to SCI01A01.NTX
   close databases
endif

if ! file("SCI02A01.NTX")
   use SCA01.DBF
   index on A01_DESCRI to SCI02A01.NTX
   close databases
endif

if ! file("SCI03A01.NTX")
   use SCA01.DBF
   index on A01_CODFOR to SCI03A01.NTX
   close databases
endif

************ SCA02

if ! file("SCA02.DBF")
   mens1="      Arquivo de FORNECEDORES n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SCI01A02.NTX")
   use SCA02.DBF
   index on A02_CODFOR to SCI01A02.NTX
   close databases
endif

if ! file("SCI02A02.NTX")
   use SCA02.DBF
   index on A02_RAZAO to SCI02A02.NTX
   close databases
endif

************ SCA03

if ! file("SCA03.DBF")
   mens1="      Arquivo de clientes n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SCI01A03.NTX")
   use SCA03.DBF
   index on A03_COD to SCI01A03.NTX
   close databases
endif

if ! file("SCI02A03.NTX")
   use SCA03.DBF
   index on A03_NOME to SCI02A03.NTX
   close databases
endif

************ SCA04

if ! file("SCA04.DBF")
   mens1="      Arquivo registro de entradas n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SCI01A04.NTX")
   use SCA04.DBF
   index on dtos(A04_DTAEMI)+str(A04_CODFOR)+str(A04_NRONF,9) to SCI01A04.NTX
   close databases
endif

if ! file("SCI02A04.NTX")
   use SCA04.DBF
   index on A04_CODPRO to SCI02A04.NTX
   close databases
endif

if ! file("SCI03A04.NTX")
   use SCA04.DBF
   index on str(A04_CODFOR) + dtos(A04_DTAEMI) to SCI03A04.NTX
   close databases
endif

if ! file("SCI04A04.NTX")
   use SCA04.DBF
   index on str(A04_CODFOR,5)+str(A04_NRONF,9)+dtos(A04_DTAEMI)+str(A04_CODPRO,8) to SCI04A04.NTX
   close databases
endif

************ SCA05

if ! file("SCA05.DBF")
   mens1="      Arquivo registro de saidas n∆o encontrado!"
   mens2="Provavelmente ele foi apagado ou removido ..."
   Mens_erro(mens1,mens2)
   Tela_fim()
   return
endif

if ! file("SCI01A05.NTX")
   use SCA05.DBF
   index on dtos(A05_DTAEMI)+str(A05_CODCLI)+str(A05_NRONF,6) to SCI01A05.NTX
   close databases
endif


if ! file("SCI02A05.NTX")
   use SCA05.DBF
   index on A05_NRONF to SCI02A05.NTX
   close databases
endif


if ! file("SCI03A05.NTX")
   use SCA05.DBF
   index on A05_CODPRO to SCI03A05.NTX
   close databases
endif

if ! file("SCI04A05.NTX")
   use SCA05.DBF
   index on str(A05_CODCLI,5)+str(A05_NRONF,6)+dtos(A05_DTAEMI)+str(A05_CODPRO,8) to SCI04A05.NTX
   close databases
endif


@ 13,10 say space(60)

return
