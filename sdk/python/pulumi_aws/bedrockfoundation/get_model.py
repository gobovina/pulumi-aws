# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'GetModelResult',
    'AwaitableGetModelResult',
    'get_model',
    'get_model_output',
]

@pulumi.output_type
class GetModelResult:
    """
    A collection of values returned by getModel.
    """
    def __init__(__self__, customizations_supporteds=None, id=None, inference_types_supporteds=None, input_modalities=None, model_arn=None, model_id=None, model_name=None, output_modalities=None, provider_name=None, response_streaming_supported=None):
        if customizations_supporteds and not isinstance(customizations_supporteds, list):
            raise TypeError("Expected argument 'customizations_supporteds' to be a list")
        pulumi.set(__self__, "customizations_supporteds", customizations_supporteds)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if inference_types_supporteds and not isinstance(inference_types_supporteds, list):
            raise TypeError("Expected argument 'inference_types_supporteds' to be a list")
        pulumi.set(__self__, "inference_types_supporteds", inference_types_supporteds)
        if input_modalities and not isinstance(input_modalities, list):
            raise TypeError("Expected argument 'input_modalities' to be a list")
        pulumi.set(__self__, "input_modalities", input_modalities)
        if model_arn and not isinstance(model_arn, str):
            raise TypeError("Expected argument 'model_arn' to be a str")
        pulumi.set(__self__, "model_arn", model_arn)
        if model_id and not isinstance(model_id, str):
            raise TypeError("Expected argument 'model_id' to be a str")
        pulumi.set(__self__, "model_id", model_id)
        if model_name and not isinstance(model_name, str):
            raise TypeError("Expected argument 'model_name' to be a str")
        pulumi.set(__self__, "model_name", model_name)
        if output_modalities and not isinstance(output_modalities, list):
            raise TypeError("Expected argument 'output_modalities' to be a list")
        pulumi.set(__self__, "output_modalities", output_modalities)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if response_streaming_supported and not isinstance(response_streaming_supported, bool):
            raise TypeError("Expected argument 'response_streaming_supported' to be a bool")
        pulumi.set(__self__, "response_streaming_supported", response_streaming_supported)

    @property
    @pulumi.getter(name="customizationsSupporteds")
    def customizations_supporteds(self) -> Sequence[str]:
        """
        Customizations that the model supports.
        """
        return pulumi.get(self, "customizations_supporteds")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inferenceTypesSupporteds")
    def inference_types_supporteds(self) -> Sequence[str]:
        """
        Inference types that the model supports.
        """
        return pulumi.get(self, "inference_types_supporteds")

    @property
    @pulumi.getter(name="inputModalities")
    def input_modalities(self) -> Sequence[str]:
        """
        Input modalities that the model supports.
        """
        return pulumi.get(self, "input_modalities")

    @property
    @pulumi.getter(name="modelArn")
    def model_arn(self) -> str:
        """
        Model ARN.
        """
        return pulumi.get(self, "model_arn")

    @property
    @pulumi.getter(name="modelId")
    def model_id(self) -> str:
        return pulumi.get(self, "model_id")

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> str:
        """
        Model name.
        """
        return pulumi.get(self, "model_name")

    @property
    @pulumi.getter(name="outputModalities")
    def output_modalities(self) -> Sequence[str]:
        """
        Output modalities that the model supports.
        """
        return pulumi.get(self, "output_modalities")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        """
        Model provider name.
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="responseStreamingSupported")
    def response_streaming_supported(self) -> bool:
        """
        Indicates whether the model supports streaming.
        """
        return pulumi.get(self, "response_streaming_supported")


class AwaitableGetModelResult(GetModelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetModelResult(
            customizations_supporteds=self.customizations_supporteds,
            id=self.id,
            inference_types_supporteds=self.inference_types_supporteds,
            input_modalities=self.input_modalities,
            model_arn=self.model_arn,
            model_id=self.model_id,
            model_name=self.model_name,
            output_modalities=self.output_modalities,
            provider_name=self.provider_name,
            response_streaming_supported=self.response_streaming_supported)


def get_model(model_id: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetModelResult:
    """
    Data source for managing an AWS Bedrock Foundation Model.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models()
    test_get_model = aws.bedrockfoundation.get_model(model_id=test.model_summaries[0].model_id)
    ```


    :param str model_id: Model identifier.
    """
    __args__ = dict()
    __args__['modelId'] = model_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:bedrockfoundation/getModel:getModel', __args__, opts=opts, typ=GetModelResult).value

    return AwaitableGetModelResult(
        customizations_supporteds=pulumi.get(__ret__, 'customizations_supporteds'),
        id=pulumi.get(__ret__, 'id'),
        inference_types_supporteds=pulumi.get(__ret__, 'inference_types_supporteds'),
        input_modalities=pulumi.get(__ret__, 'input_modalities'),
        model_arn=pulumi.get(__ret__, 'model_arn'),
        model_id=pulumi.get(__ret__, 'model_id'),
        model_name=pulumi.get(__ret__, 'model_name'),
        output_modalities=pulumi.get(__ret__, 'output_modalities'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        response_streaming_supported=pulumi.get(__ret__, 'response_streaming_supported'))


@_utilities.lift_output_func(get_model)
def get_model_output(model_id: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetModelResult]:
    """
    Data source for managing an AWS Bedrock Foundation Model.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrockfoundation.get_models()
    test_get_model = aws.bedrockfoundation.get_model(model_id=test.model_summaries[0].model_id)
    ```


    :param str model_id: Model identifier.
    """
    ...
