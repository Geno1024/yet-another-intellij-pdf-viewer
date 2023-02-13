package com.geno1024.anotherpdfviewer.lang

import com.geno1024.anotherpdfviewer.icons.PdfViewerIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object PdfFileType : LanguageFileType(PdfLanguage)
{
    override fun getName(): String = "PDF"

    override fun getDescription(): String = "Portable document format."

    override fun getDefaultExtension(): String = "pdf"

    override fun getIcon(): Icon = PdfViewerIcons.PDF_FILE

}
