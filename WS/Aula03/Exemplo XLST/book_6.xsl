<?xml version="1.0"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output  method="text" indent="yes"/>

  	<xsl:template match="text()" />

	<xsl:template match="booklist">
      	<xsl:apply-templates/>
  	</xsl:template>

	<xsl:template match="book">
	____________________ Livro ______________________________
      	<xsl:apply-templates/>
	</xsl:template>

	<xsl:template match="author">
	AUTOR: <xsl:value-of select="."/>
	</xsl:template> 
</xsl:stylesheet>





