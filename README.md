# Decoder-design-pattern



The last project didn’t do well on the market. You quit freelancing and you
are now employed by ZırhSan A.Ş, a private company specializing in the design and production of
exoskeleton armored suits for military personnel, equipped with various custom weapons.
There are 3 basic types of suits: dec (500k TL, 25kg), ora (1500k TL, 30kg) and tor (5000k TL,
50kg).
Each of these suits can be equipped with the following accessories:
• Flamethrower (50k TL per item, 2k)
• AutoRifle (30k TL per item, 1.5kg)
• RocketLauncher (150k TL per item, 7.5kg)
• Laser (200k TL per item, 5.5kg)
A customer can demand any custom combination of accessories: such as a dec suit with 1
flamethrower, 2 automatic rifles and 1 rocket launcher.
Your task is to develop a piece of software in Java able to calculate the total cost and weight of an
equipped suit (total price = basic suit price + prices of the accessories). The user of the software
should be able to designate any combination of accessories dynamically at runtime. Your design
should be flexible and easy to accommodate new accessories and suit types






I used decoder design pattern.
Because of,there are different properties in accessories and suites.
However customer want to sum total some properties.
Accessories should not access some methods of suits.
So accesories should holds on super abstract class of suits.
So accessory can not get everything accessory wanted.
Only can access that there are methods in super abstract class.
This is flexxible and loose coupling.


