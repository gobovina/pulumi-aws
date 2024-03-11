// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettings
    {
        /// <summary>
        /// Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
        /// </summary>
        public readonly string? CopyrightHolder;
        /// <summary>
        /// Specifies how to handle the gap between the lines (in multi-line captions). - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the gap unfilled.
        /// </summary>
        public readonly string? FillLineGap;
        /// <summary>
        /// Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to “monospaced”. (If styleControl is set to exclude, the font family is always set to “monospaced”.) You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100%!t(MISSING)o allow the downstream player to choose the size. - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font). - Leave blank to set the family to “monospace”.
        /// </summary>
        public readonly string? FontFamily;
        /// <summary>
        /// Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions. - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font family to “monospaced”. Do not include any other style information.
        /// </summary>
        public readonly string? StyleControl;

        [OutputConstructor]
        private ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettings(
            string? copyrightHolder,

            string? fillLineGap,

            string? fontFamily,

            string? styleControl)
        {
            CopyrightHolder = copyrightHolder;
            FillLineGap = fillLineGap;
            FontFamily = fontFamily;
            StyleControl = styleControl;
        }
    }
}
