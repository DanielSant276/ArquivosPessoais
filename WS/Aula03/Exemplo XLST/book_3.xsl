<?xml version="1.0"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output  method="text" indent="yes"/>

	<xsl:template match="*">
	</xsl:template>

	<xsl:template match="booklist">
	===============Lista de livros===============  
		<xsl:apply-templates/>
	===============Fim da lista================= 
	</xsl:template>


</xsl:stylesheet>



