# SpringBoot����������Ŀ

## ��Ŀ����:���ڶ�ҵ�񼯳ɵ�У԰������վ

> ### �ⶨ��Ҫʵ�ֵ�ҵ��ģ�飺
>
> ##### ����ģ�飺
>
> 1:�̼ҷ�����Ʒ��ʵ�ֶԸ����̵�Ķ�����Ʒ�����̼��з��࣬�������������ֵ�Ӱ�����ȵȡ�
> 2���̼ҿ��Թ����Լ��̼��µ�Ա������ɻ�����CURD��
> 3��ʵ�����۹��ܣ��û��µ���ſ������ۣ����۵�����Ӧ�ð��������ϴ����ֻ���ͼƬ
>
> ###### ����ģ�飺
>
> 1������QQ��̬?�û�����ɹ���ճ�����״̬��ͼƬ���ֵ�
> 2:���̼ҵĲ�Ʒʵ�����۹��ܣ�ͨ���������̽��֮��ſ������ۣ���ӵ�ַ���񣬿�����ʾ��ǰλ�á�
>
> ###### ��ģ�飺
>
> 3:��������ģ�飺����һ������̽��ģ�飬�û�����ɾ��������֮����Է�����̬���е������������㲥�������û���==���ֳ�һ������ı�ͬʱ�����û��������ۡ�
> 4:Ҫʵ�ֹ�ע���ܣ��û���ע���̵���߲�����ͬʱ�Լ����Ա���ע��Ϊ������

### **����ѡ�ͣ�**

#### SpringBoot��Mybatis-plus��Mysql��Redis(��ע����֤��)��Mail,Swagger,EasyExcel(�����ȵ����ݣ��̵��ע�û���ʵ�ֵ��̺Ͳ�����һЩ���ݷ���) ��Ȩ�ޣ�JWT+token,Scheduled��ʱ�ƻ�ʵ�ֵ��̵���Ʒ�ϼ��¼ܹصꡣ

####ǰ�ˣ�Html+Css+BootStrap+axios+ajax+vue

#### ���ƺ��ǣ�Linux+Nginx+Docker  Esģ���ؼ������� MongoDb

#### ��Ŀ��֯�ܹ��ⶨΪ������Ŀ���������� ��2023-4-25  == 2023-6-12

### ���ݿ���ƣ�������ǰ׺prefix=rainy_����

���� ��

�̼ҷ����:shop_classify���̼�Ա����:shop_employee���̼���Ʒ��shop_goods ���̵���Ʒ���۱�shop_goods_comments,�̵��shop_info,������shop_orders

�û��������û���user,��ʷ�µ���user_history_orders,���۱�user_comments��������Ϣ��user_info

#### ��������ֶΣ�

| ���ݿ��ֶ����                                                                                                                               |  |  |
| :------------------------------------------------------------------------------------------------------------------------------------------- | - | - |
| shop_orders��:id��order_time��user_address,user_phone,all_money,user_id,goods_name                                                           |  |  |
| shop_info��:shop_name,shop_rank������������,shop_type��������Ӫҵ��,shop_img,shop_address�����̵�ַ��,shop_phone,id��update_time(����ʱ��) |  |  |
| shop_classify��:shop_type��������Ӫҵ��,id                                                                                                 |  |  |
| shop_employee��:employee_name,id,username(Ψһ),password,isdroped(�Ƿ��ͣ�0�ǣ�1��),phone,email,gender                                     |  |  |
| shop_goods��id,goods_name,goods_price,goods_image,goods_description,goods_isdroped(�Ƿ��ϼܣ�0�ǣ�1��)                                     |  |  |
| shop_good_comment��:id��user_id�������˵ģ�id��,content,comment_time,isdeleted(�Ƿ�ɾ�����ۣ�yes:1,not:0)                                    |  |  |
| user��:id,username,password,email,nick_name,user_role(1Ϊ����Աadmin),user_id                                                                |  |  |
| user_history_orders��:id,user_id,goods_name,all_money                                                                                        |  |  |
| userinfo��signature(ǩ��)��user_id��gender,user_phone��id                                                                                  |  |  |
|                                                                                                                                              |  |  |

#### ������϶ȣ���ȷ�ֹ�Service��Mapper
