/*
* JavaScript Template v0.1
* Copyright 2013, Poppy Chen
* www.xiguabaobao.com
* Free to use under the MIT license.
* http://www.opensource.org/licenses/mit-license.php
* 2013-9-9
*/


/* Table of Content
==================================================
	#Basic Scripts
	#Site Scripts 
	#Page Scripts */


/* #Basic Scripts����ʹ��jQueryʱ��Ϊ�����ͻ����ɾ������ע�ʹ˲��֡���
==================================================*/


/* #Site Scripts
==================================================*/


/* #Page Scripts
==================================================*/
	$(document).ready(function(){
		/**
		 * ����������ͣ�¼�
		 */
		var $active = $('.side_item.active');
		$('.side_item').hover(function(){
			//�Ƴ�����
			$('.side_item').removeClass('active');
			//���ǰ.side_item
			$(this).addClass('active');
		},function(){
			//�Ƴ�����
			$('.side_item').removeClass('active');
			//����ԭ��.side_item
			$active.addClass('active');
		});


		/**
		 * .option�����б��¼�
		 */
		//չ��/���������б�
		$('.option').click(function(){
			$(this).children('.option_list').slideToggle(200);
			$(this).toggleClass('active');
		});
		//����option��ֵ
		$('.option_list li').click(function(){
			//��ȡѡ���ֵ
			var text = $(this).text();
			//����option��ֵ
			$(this).parent().siblings('.option_result').text(text);
		});


		/**
		 * modal�¼�
		 */
		$('.modal-toggle').click(function(){
			$('#notice-modal').fadeIn('fast');
			$('#notice-modal').next('.modal-bg').fadeIn('fast');
		});

		/**
		 * �ر��¼�
		 */
		$('.close').click(function(){
			$('#notice-modal').fadeOut('fast');
			$('#notice-modal').next('.modal-bg').fadeOut('fast');
		});
	});
