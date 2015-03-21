StealthMS - мидлет с открытыми исходниками, который позволяет отсылать SMS через GPRS, в 99% случаев это выходит существенно дешевле, чем слать обычные сообщения.

В данный момент в разработке мидлета участвуют Kitten (misha.cn.ua), KosteT (dolbonoz), Frozen Fire (rysenko).

Адрес проекта: http://code.google.com/p/stealthms/

Адрес для загрузки с телефона: http://rysenko.info/wap/

Возможности:
  * Отправка через любой SMTP (поддерживаеются SMTP с PLAIN/LOGIN-авторизацией)
  * Отправка через сайт KS
  * Отправка сообщений обычным способом (GSM)
  * Отправка через сервер e2s.org.ua (спасибо YURiQUE за этот сервер)
  * Сохранение и последующая подгрузка сохраненных сообщений
  * Сохранение последних номеров на которые было отослано SMS и возможность выбрать из них
  * Возможность использовать встроенную в телефон записную книжку (кроме телефонов Motorola, Samsung)
  * Автоматическая разбивка длинных сообщений на части по 160/70 символов
  * Автоматическая (отключаемая) транслитерация сообщений
  * Эмуляция подтвержения о доставке в пределах одного оператора при отправке через SMTP

Планируемые возможности:
  * Гибкая конфигурация фильтров номеров и способов отправки для них
  * Настраиваемая отправка через формы операторов
  * Встроенная записная книжка (не телефонная)
  * Вычитка телефонной книжки через JSR-75 PIM (для тех телефонов где это есть)

Изначально программа настроена под украинский UMC и шлет только на украинские операторы, но конфигурацию можно менять.

Настройка:
  * Адрес - любой E-Mail адрес (с некотрых адресов может не пропускать спам-фильтр вашего оператора)
  * Сервер - адрес SMTP или HTTP сервера для отправки (если ваш оператор не предоставляет свой SMTP, используйте общедоступный типа smtp.yandex.ru)
  * Логин/Пароль - только для SMTP с авторизацией (почти все общедоступные SMTP требуют авторизации)
  * Гейты - конфигурация e-mail2sms гейтов
  * Копия - ваш адрес, если вы хотите, чтобы вам приходил отчет (в пределах одного оператора через SMTP)
  * Семья - номера, на которые будут слаться обычные сообщения через SMS транспорт
  * Через KS - на эти номера сообщения будут отсылаться через сайт KyivStar

Расскажу пожалуй про подтверждение отправки, я его рассматриваю скорее как подтверждение о доставке. Работает это только в пределах одного оператора через SMTP транспорт. Устроено так вместе с СМС для отправки в очередь ложится также сообщение об отправке для себя. Т.о. образом эти 2 сообщения также попадают рядом в очередь email2sms гейта. И если оператор доставит одно из них, то 99% что и другое тоже (если только другой телефон не был выключен).

Мидлет должен в полном объеме работать на всех MIDP2.0 телефонах и Siemens MIDP1.0. На просто MIDP1.0 (не Siemens) часть функций работать не будет (как минимум не будет работать отправка через SMTP).