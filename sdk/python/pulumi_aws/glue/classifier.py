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
from . import outputs
from ._inputs import *

__all__ = ['ClassifierArgs', 'Classifier']

@pulumi.input_type
class ClassifierArgs:
    def __init__(__self__, *,
                 csv_classifier: Optional[pulumi.Input['ClassifierCsvClassifierArgs']] = None,
                 grok_classifier: Optional[pulumi.Input['ClassifierGrokClassifierArgs']] = None,
                 json_classifier: Optional[pulumi.Input['ClassifierJsonClassifierArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 xml_classifier: Optional[pulumi.Input['ClassifierXmlClassifierArgs']] = None):
        """
        The set of arguments for constructing a Classifier resource.
        :param pulumi.Input['ClassifierCsvClassifierArgs'] csv_classifier: A classifier for Csv content. Defined below.
        :param pulumi.Input['ClassifierGrokClassifierArgs'] grok_classifier: A classifier that uses grok patterns. Defined below.
        :param pulumi.Input['ClassifierJsonClassifierArgs'] json_classifier: A classifier for JSON content. Defined below.
        :param pulumi.Input[str] name: The name of the classifier.
        :param pulumi.Input['ClassifierXmlClassifierArgs'] xml_classifier: A classifier for XML content. Defined below.
        """
        if csv_classifier is not None:
            pulumi.set(__self__, "csv_classifier", csv_classifier)
        if grok_classifier is not None:
            pulumi.set(__self__, "grok_classifier", grok_classifier)
        if json_classifier is not None:
            pulumi.set(__self__, "json_classifier", json_classifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if xml_classifier is not None:
            pulumi.set(__self__, "xml_classifier", xml_classifier)

    @property
    @pulumi.getter(name="csvClassifier")
    def csv_classifier(self) -> Optional[pulumi.Input['ClassifierCsvClassifierArgs']]:
        """
        A classifier for Csv content. Defined below.
        """
        return pulumi.get(self, "csv_classifier")

    @csv_classifier.setter
    def csv_classifier(self, value: Optional[pulumi.Input['ClassifierCsvClassifierArgs']]):
        pulumi.set(self, "csv_classifier", value)

    @property
    @pulumi.getter(name="grokClassifier")
    def grok_classifier(self) -> Optional[pulumi.Input['ClassifierGrokClassifierArgs']]:
        """
        A classifier that uses grok patterns. Defined below.
        """
        return pulumi.get(self, "grok_classifier")

    @grok_classifier.setter
    def grok_classifier(self, value: Optional[pulumi.Input['ClassifierGrokClassifierArgs']]):
        pulumi.set(self, "grok_classifier", value)

    @property
    @pulumi.getter(name="jsonClassifier")
    def json_classifier(self) -> Optional[pulumi.Input['ClassifierJsonClassifierArgs']]:
        """
        A classifier for JSON content. Defined below.
        """
        return pulumi.get(self, "json_classifier")

    @json_classifier.setter
    def json_classifier(self, value: Optional[pulumi.Input['ClassifierJsonClassifierArgs']]):
        pulumi.set(self, "json_classifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the classifier.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="xmlClassifier")
    def xml_classifier(self) -> Optional[pulumi.Input['ClassifierXmlClassifierArgs']]:
        """
        A classifier for XML content. Defined below.
        """
        return pulumi.get(self, "xml_classifier")

    @xml_classifier.setter
    def xml_classifier(self, value: Optional[pulumi.Input['ClassifierXmlClassifierArgs']]):
        pulumi.set(self, "xml_classifier", value)


@pulumi.input_type
class _ClassifierState:
    def __init__(__self__, *,
                 csv_classifier: Optional[pulumi.Input['ClassifierCsvClassifierArgs']] = None,
                 grok_classifier: Optional[pulumi.Input['ClassifierGrokClassifierArgs']] = None,
                 json_classifier: Optional[pulumi.Input['ClassifierJsonClassifierArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 xml_classifier: Optional[pulumi.Input['ClassifierXmlClassifierArgs']] = None):
        """
        Input properties used for looking up and filtering Classifier resources.
        :param pulumi.Input['ClassifierCsvClassifierArgs'] csv_classifier: A classifier for Csv content. Defined below.
        :param pulumi.Input['ClassifierGrokClassifierArgs'] grok_classifier: A classifier that uses grok patterns. Defined below.
        :param pulumi.Input['ClassifierJsonClassifierArgs'] json_classifier: A classifier for JSON content. Defined below.
        :param pulumi.Input[str] name: The name of the classifier.
        :param pulumi.Input['ClassifierXmlClassifierArgs'] xml_classifier: A classifier for XML content. Defined below.
        """
        if csv_classifier is not None:
            pulumi.set(__self__, "csv_classifier", csv_classifier)
        if grok_classifier is not None:
            pulumi.set(__self__, "grok_classifier", grok_classifier)
        if json_classifier is not None:
            pulumi.set(__self__, "json_classifier", json_classifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if xml_classifier is not None:
            pulumi.set(__self__, "xml_classifier", xml_classifier)

    @property
    @pulumi.getter(name="csvClassifier")
    def csv_classifier(self) -> Optional[pulumi.Input['ClassifierCsvClassifierArgs']]:
        """
        A classifier for Csv content. Defined below.
        """
        return pulumi.get(self, "csv_classifier")

    @csv_classifier.setter
    def csv_classifier(self, value: Optional[pulumi.Input['ClassifierCsvClassifierArgs']]):
        pulumi.set(self, "csv_classifier", value)

    @property
    @pulumi.getter(name="grokClassifier")
    def grok_classifier(self) -> Optional[pulumi.Input['ClassifierGrokClassifierArgs']]:
        """
        A classifier that uses grok patterns. Defined below.
        """
        return pulumi.get(self, "grok_classifier")

    @grok_classifier.setter
    def grok_classifier(self, value: Optional[pulumi.Input['ClassifierGrokClassifierArgs']]):
        pulumi.set(self, "grok_classifier", value)

    @property
    @pulumi.getter(name="jsonClassifier")
    def json_classifier(self) -> Optional[pulumi.Input['ClassifierJsonClassifierArgs']]:
        """
        A classifier for JSON content. Defined below.
        """
        return pulumi.get(self, "json_classifier")

    @json_classifier.setter
    def json_classifier(self, value: Optional[pulumi.Input['ClassifierJsonClassifierArgs']]):
        pulumi.set(self, "json_classifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the classifier.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="xmlClassifier")
    def xml_classifier(self) -> Optional[pulumi.Input['ClassifierXmlClassifierArgs']]:
        """
        A classifier for XML content. Defined below.
        """
        return pulumi.get(self, "xml_classifier")

    @xml_classifier.setter
    def xml_classifier(self, value: Optional[pulumi.Input['ClassifierXmlClassifierArgs']]):
        pulumi.set(self, "xml_classifier", value)


class Classifier(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 csv_classifier: Optional[pulumi.Input[Union['ClassifierCsvClassifierArgs', 'ClassifierCsvClassifierArgsDict']]] = None,
                 grok_classifier: Optional[pulumi.Input[Union['ClassifierGrokClassifierArgs', 'ClassifierGrokClassifierArgsDict']]] = None,
                 json_classifier: Optional[pulumi.Input[Union['ClassifierJsonClassifierArgs', 'ClassifierJsonClassifierArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 xml_classifier: Optional[pulumi.Input[Union['ClassifierXmlClassifierArgs', 'ClassifierXmlClassifierArgsDict']]] = None,
                 __props__=None):
        """
        Provides a Glue Classifier resource.

        > **NOTE:** It is only valid to create one type of classifier (csv, grok, JSON, or XML). Changing classifier types will recreate the classifier.

        ## Example Usage

        ### Csv Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            csv_classifier={
                "allowSingleColumn": False,
                "containsHeader": "PRESENT",
                "delimiter": ",",
                "disableValueTrimming": False,
                "headers": [
                    "example1",
                    "example2",
                ],
                "quoteSymbol": "'",
            })
        ```

        ### Grok Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            grok_classifier={
                "classification": "example",
                "grokPattern": "example",
            })
        ```

        ### JSON Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            json_classifier={
                "jsonPath": "example",
            })
        ```

        ### XML Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            xml_classifier={
                "classification": "example",
                "rowTag": "example",
            })
        ```

        ## Import

        Using `pulumi import`, import Glue Classifiers using their name. For example:

        ```sh
        $ pulumi import aws:glue/classifier:Classifier MyClassifier MyClassifier
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ClassifierCsvClassifierArgs', 'ClassifierCsvClassifierArgsDict']] csv_classifier: A classifier for Csv content. Defined below.
        :param pulumi.Input[Union['ClassifierGrokClassifierArgs', 'ClassifierGrokClassifierArgsDict']] grok_classifier: A classifier that uses grok patterns. Defined below.
        :param pulumi.Input[Union['ClassifierJsonClassifierArgs', 'ClassifierJsonClassifierArgsDict']] json_classifier: A classifier for JSON content. Defined below.
        :param pulumi.Input[str] name: The name of the classifier.
        :param pulumi.Input[Union['ClassifierXmlClassifierArgs', 'ClassifierXmlClassifierArgsDict']] xml_classifier: A classifier for XML content. Defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ClassifierArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Glue Classifier resource.

        > **NOTE:** It is only valid to create one type of classifier (csv, grok, JSON, or XML). Changing classifier types will recreate the classifier.

        ## Example Usage

        ### Csv Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            csv_classifier={
                "allowSingleColumn": False,
                "containsHeader": "PRESENT",
                "delimiter": ",",
                "disableValueTrimming": False,
                "headers": [
                    "example1",
                    "example2",
                ],
                "quoteSymbol": "'",
            })
        ```

        ### Grok Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            grok_classifier={
                "classification": "example",
                "grokPattern": "example",
            })
        ```

        ### JSON Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            json_classifier={
                "jsonPath": "example",
            })
        ```

        ### XML Classifier

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glue.Classifier("example",
            name="example",
            xml_classifier={
                "classification": "example",
                "rowTag": "example",
            })
        ```

        ## Import

        Using `pulumi import`, import Glue Classifiers using their name. For example:

        ```sh
        $ pulumi import aws:glue/classifier:Classifier MyClassifier MyClassifier
        ```

        :param str resource_name: The name of the resource.
        :param ClassifierArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClassifierArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 csv_classifier: Optional[pulumi.Input[Union['ClassifierCsvClassifierArgs', 'ClassifierCsvClassifierArgsDict']]] = None,
                 grok_classifier: Optional[pulumi.Input[Union['ClassifierGrokClassifierArgs', 'ClassifierGrokClassifierArgsDict']]] = None,
                 json_classifier: Optional[pulumi.Input[Union['ClassifierJsonClassifierArgs', 'ClassifierJsonClassifierArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 xml_classifier: Optional[pulumi.Input[Union['ClassifierXmlClassifierArgs', 'ClassifierXmlClassifierArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClassifierArgs.__new__(ClassifierArgs)

            __props__.__dict__["csv_classifier"] = csv_classifier
            __props__.__dict__["grok_classifier"] = grok_classifier
            __props__.__dict__["json_classifier"] = json_classifier
            __props__.__dict__["name"] = name
            __props__.__dict__["xml_classifier"] = xml_classifier
        super(Classifier, __self__).__init__(
            'aws:glue/classifier:Classifier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            csv_classifier: Optional[pulumi.Input[Union['ClassifierCsvClassifierArgs', 'ClassifierCsvClassifierArgsDict']]] = None,
            grok_classifier: Optional[pulumi.Input[Union['ClassifierGrokClassifierArgs', 'ClassifierGrokClassifierArgsDict']]] = None,
            json_classifier: Optional[pulumi.Input[Union['ClassifierJsonClassifierArgs', 'ClassifierJsonClassifierArgsDict']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            xml_classifier: Optional[pulumi.Input[Union['ClassifierXmlClassifierArgs', 'ClassifierXmlClassifierArgsDict']]] = None) -> 'Classifier':
        """
        Get an existing Classifier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ClassifierCsvClassifierArgs', 'ClassifierCsvClassifierArgsDict']] csv_classifier: A classifier for Csv content. Defined below.
        :param pulumi.Input[Union['ClassifierGrokClassifierArgs', 'ClassifierGrokClassifierArgsDict']] grok_classifier: A classifier that uses grok patterns. Defined below.
        :param pulumi.Input[Union['ClassifierJsonClassifierArgs', 'ClassifierJsonClassifierArgsDict']] json_classifier: A classifier for JSON content. Defined below.
        :param pulumi.Input[str] name: The name of the classifier.
        :param pulumi.Input[Union['ClassifierXmlClassifierArgs', 'ClassifierXmlClassifierArgsDict']] xml_classifier: A classifier for XML content. Defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClassifierState.__new__(_ClassifierState)

        __props__.__dict__["csv_classifier"] = csv_classifier
        __props__.__dict__["grok_classifier"] = grok_classifier
        __props__.__dict__["json_classifier"] = json_classifier
        __props__.__dict__["name"] = name
        __props__.__dict__["xml_classifier"] = xml_classifier
        return Classifier(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="csvClassifier")
    def csv_classifier(self) -> pulumi.Output[Optional['outputs.ClassifierCsvClassifier']]:
        """
        A classifier for Csv content. Defined below.
        """
        return pulumi.get(self, "csv_classifier")

    @property
    @pulumi.getter(name="grokClassifier")
    def grok_classifier(self) -> pulumi.Output[Optional['outputs.ClassifierGrokClassifier']]:
        """
        A classifier that uses grok patterns. Defined below.
        """
        return pulumi.get(self, "grok_classifier")

    @property
    @pulumi.getter(name="jsonClassifier")
    def json_classifier(self) -> pulumi.Output[Optional['outputs.ClassifierJsonClassifier']]:
        """
        A classifier for JSON content. Defined below.
        """
        return pulumi.get(self, "json_classifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the classifier.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="xmlClassifier")
    def xml_classifier(self) -> pulumi.Output[Optional['outputs.ClassifierXmlClassifier']]:
        """
        A classifier for XML content. Defined below.
        """
        return pulumi.get(self, "xml_classifier")

