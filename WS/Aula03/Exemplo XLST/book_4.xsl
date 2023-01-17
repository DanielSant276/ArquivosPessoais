<?xml version="1.0"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output  method="text" indent="yes"/>


  <xsl:template match="author">
	================Livro do autor================
  		<xsl:apply-templates/>
	================Detalhes do livro==============
  </xsl:template>  

</xsl:stylesheet>



