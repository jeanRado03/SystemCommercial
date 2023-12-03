create sequence personne_seq start with 1 increment by 1;
create sequence fournisseur_seq start with 1 increment by 1;
create sequence article_seq start with 1 increment by 1;
create sequence emp_seq start with 1 increment by 1;
create sequence deptemp_seq start with 1 increment by 1;
create sequence dept_seq start with 1 increment by 1;
create sequence besoin_seq start with 1 increment by 1;

CREATE OR REPLACE View v_personne_seq as select nextval('personne_seq');
CREATE OR REPLACE View v_fournisseur_seq as select nextval('fournisseur_seq');
CREATE OR REPLACE View v_article_seq as select nextval('article_seq');
CREATE OR REPLACE View v_employer_seq as select nextval('emp_seq');
CREATE OR REPLACE View v_deptemp_seq as select nextval('deptemp_seq');
CREATE OR REPLACE View v_dept_seq as select nextval('dept_seq');
CREATE OR REPLACE View v_besoin_seq as select nextval('besoin_seq');

CREATE OR REPLACE View v_get_besoin_service_non_validee as select article.nature, count(article.nature) from besoin_service join article on besoin_service.idarticle = article.idarticle where besoin_service.etat = 10 group by article.nature;
CREATE OR REPLACE View v_detail_besoin_nature as select bs.idbs,bs.quantite,bs.unite,article.designation,article.nature from besoin_service as bs join article on bs.idarticle = article.idarticle where bs.etat = 10;
CREATE OR REPLACE View v_besoin_validee as select bs.idbs,bs.quantite,bs.unite,article.designation,article.nature from besoin_service as bs join article on bs.idarticle = article.idarticle where bs.etat = 20;
CREATE OR REPLACE FUNCTION getSequence(length integer, prefix text, seq bigint)
RETURNS text
language plpgsql
AS $$
BEGIN
    return prefix || lpad(CAST(seq as text), length, '0');
END;
$$;


select*from v_get_besoin_service_non_validee;
select*from v_detail_besoin_nature where nature = 'materiel';
select*from v_besoin_validee;
