# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetModelsResult',
    'AwaitableGetModelsResult',
    'get_models',
    'get_models_output',
]

@pulumi.output_type
class GetModelsResult:
    """
    A collection of values returned by getModels.
    """
    def __init__(__self__, by_customization_type=None, by_inference_type=None, by_output_modality=None, by_provider=None, id=None, model_summaries=None):
        if by_customization_type and not isinstance(by_customization_type, str):
            raise TypeError("Expected argument 'by_customization_type' to be a str")
        pulumi.set(__self__, "by_customization_type", by_customization_type)
        if by_inference_type and not isinstance(by_inference_type, str):
            raise TypeError("Expected argument 'by_inference_type' to be a str")
        pulumi.set(__self__, "by_inference_type", by_inference_type)
        if by_output_modality and not isinstance(by_output_modality, str):
            raise TypeError("Expected argument 'by_output_modality' to be a str")
        pulumi.set(__self__, "by_output_modality", by_output_modality)
        if by_provider and not isinstance(by_provider, str):
            raise TypeError("Expected argument 'by_provider' to be a str")
        pulumi.set(__self__, "by_provider", by_provider)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if model_summaries and not isinstance(model_summaries, list):
            raise TypeError("Expected argument 'model_summaries' to be a list")
        pulumi.set(__self__, "model_summaries", model_summaries)

    @property
    @pulumi.getter(name="byCustomizationType")
    def by_customization_type(self) -> Optional[str]:
        return pulumi.get(self, "by_customization_type")

    @property
    @pulumi.getter(name="byInferenceType")
    def by_inference_type(self) -> Optional[str]:
        return pulumi.get(self, "by_inference_type")

    @property
    @pulumi.getter(name="byOutputModality")
    def by_output_modality(self) -> Optional[str]:
        return pulumi.get(self, "by_output_modality")

    @property
    @pulumi.getter(name="byProvider")
    def by_provider(self) -> Optional[str]:
        return pulumi.get(self, "by_provider")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        AWS region.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="modelSummaries")
    def model_summaries(self) -> Sequence['outputs.GetModelsModelSummaryResult']:
        """
        List of model summary objects. See `model_summaries`.
        """
        return pulumi.get(self, "model_summaries")


class AwaitableGetModelsResult(GetModelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetModelsResult(
            by_customization_type=self.by_customization_type,
            by_inference_type=self.by_inference_type,
            by_output_modality=self.by_output_modality,
            by_provider=self.by_provider,
            id=self.id,
            model_summaries=self.model_summaries)


def get_models(by_customization_type: Optional[str] = None,
               by_inference_type: Optional[str] = None,
               by_output_modality: Optional[str] = None,
               by_provider: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetModelsResult:
    """
    Data source for managing AWS Bedrock Foundation Models.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models()
    ```
    <!--End PulumiCodeChooser -->

    ### Filter by Inference Type

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models(by_inference_type="ON_DEMAND")
    ```
    <!--End PulumiCodeChooser -->


    :param str by_customization_type: Customization type to filter on. Valid values are `FINE_TUNING`.
    :param str by_inference_type: Inference type to filter on. Valid values are `ON_DEMAND` and `PROVISIONED`.
    :param str by_output_modality: Output modality to filter on. Valid values are `TEXT`, `IMAGE`, and `EMBEDDING`.
    :param str by_provider: Model provider to filter on.
    """
    __args__ = dict()
    __args__['byCustomizationType'] = by_customization_type
    __args__['byInferenceType'] = by_inference_type
    __args__['byOutputModality'] = by_output_modality
    __args__['byProvider'] = by_provider
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:bedrockfoundation/getModels:getModels', __args__, opts=opts, typ=GetModelsResult).value

    return AwaitableGetModelsResult(
        by_customization_type=pulumi.get(__ret__, 'by_customization_type'),
        by_inference_type=pulumi.get(__ret__, 'by_inference_type'),
        by_output_modality=pulumi.get(__ret__, 'by_output_modality'),
        by_provider=pulumi.get(__ret__, 'by_provider'),
        id=pulumi.get(__ret__, 'id'),
        model_summaries=pulumi.get(__ret__, 'model_summaries'))


@_utilities.lift_output_func(get_models)
def get_models_output(by_customization_type: Optional[pulumi.Input[Optional[str]]] = None,
                      by_inference_type: Optional[pulumi.Input[Optional[str]]] = None,
                      by_output_modality: Optional[pulumi.Input[Optional[str]]] = None,
                      by_provider: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetModelsResult]:
    """
    Data source for managing AWS Bedrock Foundation Models.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models()
    ```
    <!--End PulumiCodeChooser -->

    ### Filter by Inference Type

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models(by_inference_type="ON_DEMAND")
    ```
    <!--End PulumiCodeChooser -->


    :param str by_customization_type: Customization type to filter on. Valid values are `FINE_TUNING`.
    :param str by_inference_type: Inference type to filter on. Valid values are `ON_DEMAND` and `PROVISIONED`.
    :param str by_output_modality: Output modality to filter on. Valid values are `TEXT`, `IMAGE`, and `EMBEDDING`.
    :param str by_provider: Model provider to filter on.
    """
    ...
