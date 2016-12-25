# moskaliov350531-project

##Требования к проекту

###1 Введение

Проект - приложение для вызова такси. Предположительное название - "Такси-домой". позволяет вызвать такси со своего мобильного устройства без звонка на телефонные номера и разговоры. 

###2 Требования пользователя

####2.1 Программные интерфейсы
В первую очередь - данное приложение предполагается мобильным, чтоб в любом месте, где у Вас есть телефон и интернет, вы смогли вызвать себе такси, следить за тем, какой именно тип машины вы заказываете, какой сейчас тариф, выбрать адрес или вызвать такси напрямую ориентируясь на данные GPS - навигации. 
Следовательно, данное приложение будет использоавть:
- данные о местоположении
- карты (встроенные в мобильное устройство)
- мобильный календарь для заказа заранее

####2.2 Интерфейс пользователя
Интерфейс - не самый сложный среди всех мобильных устройств. На основном экране приложения будет отображаться меню выбора типа машины, строка для ввода адреса, подменю выбора даты и времени заказа, кнопка подверждения и кнопка "Местоположение".

[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/ТРИТПО%20MAIN%20SCREEN.png)]
по нажатию кнопки "местоположение" отображается карта с Вашим местоположением на ней. при выборе этого режима, сервер службы такси будет принимать не адрес, а координаты.

[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/ТРИТПо%20приложение.png)]

При выборе всех необходимых параметров и нажатии кнопки "Подтверждение" быдет доступно окошко с кратким обзором заказа и запросом на подтверждение. данное окошко введено для устранения ошибок и случайных заказов.

[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/ТРИТПО%20CONFIRM%20SCREEN.png)]


####2.3 Характеристики пользователей
Пользователем данного приложения может стать любой человек, скачав себе программу на мобильное устройство. возрастных ограничений нет. интерфейс весьма прост, понятен, элементы планируется делать крупными, что будет удобно людям с ослабленным зрением. Также оно станет полезно для "заблужившихся" людей, попавших в незнакомое место и слабо представляющих дорогу.

####2.4 Предположения и зависимости
Данное приложение не является ресурсоемким, не задействует сложные графические процессы, а следовательно - не будет особо влиятьт на работоспособность аппарата в целом. пользователю достаточно иметь актуальный смартфон, наличие интернета и включенной GPS - навигации. Основной задачей будет сделать приложение для разных платформ, с полной поддержкой функционала, что не всегда удобно, особенно это касается большого количества версий ПО, и гигантского количества различных моделей с различными техническими характеристиками. Приложение должно работать быстро на всех устройтвах 

###3 Системные требования
Как упоминалось выше, никаких специфических требований к устройству данное приложение не предполагает. практически полное отсутсвие нагрузки на графический модуль, минималистичный и понятный дизайн, большое количество "шаблонов" элементов приложения - все это сильно упрощает задачу. так что характеристики выглядят примерно так:
- актуальная версия мобильной ОС
- наличие активного интернет-соединения
- при необходимости - наличие GPS - навигации

####3.1 Функциональные требования
Краткий перечень функциональных требований:
- поддержка актуальных версий ОС
- встроенный календарь для выбора даты и времени заказа
- поддержка встроенных карт
- поддержка GPS - навигации

####3.2 Нефункциональные требования
Как говорилось выше, приложение должно быть максимально простым в освоении, в противном случае - оно не сможет заменить привычку людей "набирать номер". При отсутсвии соединения с картами, пользователю всегда может предоставляться возможность ввода адреса напрямую. 
Итого:
- простота и понятность
- доступность
- стабильность работы
- защита от ввода некорректных данных

#Диаграммы
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/class%20mb.png)]
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/activity.png)]
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/Sequences.png)]
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/state.pngg)]
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/use-case.png)]
[![N|Solid](https://github.com/6atoH4ik/moskaliov350531-project/blob/master/Приложение%20для%20вызова%20такси/Расположение.png)]
